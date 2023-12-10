package com.kgisl.ebarter.controller;

import java.io.IOException;
import java.io.InputStream;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Comparator;
import java.util.HashSet;
import java.util.List;
import java.util.OptionalDouble;
import java.util.Properties;
import java.util.Set;
import java.util.function.Predicate;
import java.util.stream.Collectors;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.kgisl.ebarter.model.Brokerage;
import com.kgisl.ebarter.utilities.MysqlConnect;

/**
 * ReportController
 */
public class ReportController extends HttpServlet {
    private static final String filename = "application.properties";
    List<Brokerage> tradeList = new ArrayList<Brokerage>();

    @Override
    // @SuppressWarnings("unchecked")
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        System.out.println("ReportController doGet called");
        Properties prop = new Properties();
        InputStream input = null;
        input = ReportController.class.getClassLoader().getResourceAsStream(filename);
        prop.load(input);

        double gst = Double.parseDouble(prop.getProperty("gst"));
        double stt = Double.parseDouble(prop.getProperty("stt"));
        double brkg = Double.parseDouble(prop.getProperty("brokerage"));
        String query = "SELECT * FROM trade";
        try {
            // new Brokerage(id, ucccode, tradedate, scrip, tradetype, quantity, price)
            ResultSet rs = MysqlConnect.getDbCon().getResultSet(query);
            // ArrayList<Object> list = new ArrayList<Object>();

            Brokerage b = new Brokerage();
            while (rs.next()) {

                b.setId(rs.getInt("id"));
                b.setUcccode(rs.getString("ucccode"));
                b.setScrip(rs.getString("scrip"));
                b.setTradedate(rs.getString("tradedate"));
                b.setTradetype(rs.getString("tradetype"));// rs.getString("tradetype")
                b.setQuantity(rs.getLong("quantity"));
                b.setPrice(rs.getDouble("tradeprice"));
                tradeList.add(b);
            }

            // tradeList.forEach(System.out::println);

            tradeList.forEach(f -> {
                f.setAmount(f.getQuantity() * f.getPrice());
                f.setBrokerage(f.getAmount() * brkg);
                // System.out.println(f.getBrokerage() + "*" + gst + "->" + (f.getBrokerage() *
                // gst));
                f.setGst(f.getBrokerage() * gst);
                f.setSt(f.getAmount() * stt);
                if (f.getTradetype() == "B") {
                    f.setNetamount(f.getBrokerage() + f.getGst() + f.getSt() + f.getAmount());
                } else {
                    f.setNetamount(f.getAmount() - (f.getBrokerage() + f.getGst() + f.getSt()));
                }
            });

            tradeList.forEach(System.out::println);

            // Answers
            System.out.println("\nTop Buy scrip in a month by Netamount");
            Predicate<Brokerage> pre = x -> x.getTradetype() == "B";
            List<Brokerage> ll = tradeList.stream().filter(pre).collect(Collectors.toList());
            ll.stream().max(Comparator.comparing(y -> y.getNetamount())).ifPresent(p -> System.out.println("" + p));

            System.out.println("\nTop Sell scrip in a month by Netamount");
            Predicate<Brokerage> pre1 = x -> x.getTradetype() == "S";
            List<Brokerage> l1 = tradeList.stream().filter(pre1).collect(Collectors.toList());
            l1.stream().max(Comparator.comparing(y -> y.getNetamount())).ifPresent(p -> System.out.println("" + p));

            System.out.println("\nTop Turnover scrip ");
            tradeList.stream().max(Comparator.comparing(y -> y.getAmount())).ifPresent(p -> System.out.println("" + p));

            System.out.println("\nLow Turnover scrip ");
            tradeList.stream().min(Comparator.comparing(y -> y.getAmount())).ifPresent(p -> System.out.println("" + p));

            System.out.println("\nNet pay for each person for given date ");

            double sum1=0; 
            System.out.println("\nTotal Brokerage for a day ");
            sum1 = tradeList.stream().mapToDouble(Brokerage::getBrokerage).sum();
            System.out.println(sum1);

            System.out.println("\nHighest Brokerage collection ");
            tradeList.stream().max(Comparator.comparing(y -> y.getBrokerage()))
                    .ifPresent(p -> System.out.println("" + p));

            System.out.println("\nAvg Buy price per scrip");
            OptionalDouble sum2 = ll.stream().mapToDouble(Brokerage::getPrice).average();
            System.out.println(sum2);

            // System.out.println(ta);
            System.out.println("\nAvg Sell price per scrip");
            OptionalDouble sum3 = l1.stream().mapToDouble(Brokerage::getPrice).average();
            System.out.println(sum3);

            System.out.println("\nTotal Brokerage for a person");

            System.out.println("\nHighest Brokerage paid on wich date by a person");
            tradeList.stream().max(Comparator.comparing(y -> y.getBrokerage())).map(Brokerage::getTradedate)
                    .ifPresent(p -> System.out.println("" + p));

            System.out.println("\nCurrent holding for a person / day");

            System.out.println("\nWho is holding highest share ");
            tradeList.stream().max(Comparator.comparing(y -> y.getQuantity()))
                    .ifPresent(p -> System.out.println("" + p));

            System.out.println("\nWho is doing tranaction on every day");
            




            req.setAttribute("sum1", sum1);
            RequestDispatcher rd = req.getRequestDispatcher("reports.jsp");
            rd.forward(req, resp);

        } catch (Exception e) {
            // TODO: handle exception
        }

    }
}