package com.kgisl.ebarter.controller;

import java.io.IOException;
import java.sql.SQLException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.kgisl.ebarter.utilities.MysqlConnect;

/**
 * UserRegController
 */
public class UserRegController extends HttpServlet {
    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        System.out.println("UserRegController doPost called");
        String username = req.getParameter("username");
        String userpass = req.getParameter("userpass");

        // String selectQuery = "select * from user where username="+"'"+name+"'"+" and
        // password="+"'"+pass+"'";
        String insertQuery = "INSERT INTO user(username, password) VALUES (" + "'" + username + "'" + ",'" + userpass
                + "'" + ")";
        System.out.println(insertQuery);
        try {
            MysqlConnect.getDbCon().insert(insertQuery);
            RequestDispatcher rd = req.getRequestDispatcher("login.jsp");
            rd.forward(req, resp);

        } catch (SQLException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
    }

}