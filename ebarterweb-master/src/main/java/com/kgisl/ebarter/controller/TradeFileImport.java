package com.kgisl.ebarter.controller;

import java.io.FileReader;
import java.io.IOException;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.kgisl.ebarter.model.Brokerage;
import com.kgisl.ebarter.utilities.MysqlConnect;
import com.opencsv.CSVParser;
import com.opencsv.CSVParserBuilder;
import com.opencsv.CSVReader;
import com.opencsv.CSVReaderBuilder;

/**
 * TradeFileImport
 */
public class TradeFileImport extends HttpServlet {
    private static final String file = "src\\main\\resources\\trade.csv";
    static List<Object> inputList = new ArrayList<Object>();

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        System.out.println("TradeFileImport doGet called");

        List<Brokerage> tradeList = (List<Brokerage>) (List<?>) TradeFileImport.processInputFile(file);
        tradeList.forEach(System.out::println);
        try {
            MysqlConnect.insertTrades(tradeList);
        } catch (SQLException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }

    }

    public static List<Object> processInputFile(String file) throws IOException {

        // CSVReader reader = new CSVReader(new FileReader(file), ',');
        FileReader filereader = new FileReader(file);

        // create csvParser object with
        // custom seperator semi-colon
        CSVParser parser = new CSVParserBuilder().withSeparator(',').build();

        // create csvReader object with
        // parameter filereader and parser
        CSVReader reader = new CSVReaderBuilder(filereader).withCSVParser(parser).build();

        List<String[]> records = reader.readAll();
        for (String[] record : records) {
            Brokerage brokerage = new Brokerage();
            brokerage.setId(Integer.parseInt(record[0]));
            brokerage.setUcccode(record[1]);
            brokerage.setTradedate(record[2]);
            brokerage.setTradetype(record[3]);
            brokerage.setScrip(record[4]);
            brokerage.setQuantity(Long.parseLong(record[5]));
            brokerage.setPrice(Double.parseDouble(record[6]));
            inputList.add(brokerage);
        }
        reader.close();
        return inputList;
    }
}