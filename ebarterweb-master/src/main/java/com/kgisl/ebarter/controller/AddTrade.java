package com.kgisl.ebarter.controller;

import java.io.*;
import java.sql.*;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.*;

import com.kgisl.ebarter.utilities.MysqlConnect;

public class AddTrade extends HttpServlet {
    public void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String id = request.getParameter("id");
        String ucccode = request.getParameter("ucccode");
        String scrip = request.getParameter("Scrip");
        String tdate = request.getParameter("tdate");
        String tradetype = request.getParameter("tradetype");
        String quantity = request.getParameter("quantity");
        String tprice = request.getParameter("tprice");
        int i = 0;
        System.out.println(id + " " + ucccode + " " + scrip + " " + tdate + " " + tradetype + " " + quantity + tprice);

        try {

            String insertQuery = "INSERT INTO trade(Id, Ucccode, Scrip, TradeDate, TradeType, Quantity, TradePrice) VALUES ("
                    + id + ",'" + ucccode + "'" + ",'" + scrip + "'" + ",'" + tdate + "'" + ",'" + tradetype + "',"
                    + quantity + "," + tprice + ")";
            System.out.println(insertQuery);
            MysqlConnect.getDbCon().insert(insertQuery);
            RequestDispatcher rd = request.getRequestDispatcher("home.jsp");
            rd.forward(request, response);
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
