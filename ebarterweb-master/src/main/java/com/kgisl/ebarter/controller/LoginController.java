package com.kgisl.ebarter.controller;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.kgisl.ebarter.utilities.MysqlConnect;

public class LoginController extends HttpServlet {

    private static final long serialVersionUID = 1L;

    public void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        response.setContentType("text/html");
        PrintWriter out = response.getWriter();

        String n = request.getParameter("username");
        String p = request.getParameter("userpass");

        HttpSession session = request.getSession(false);
        if (session != null)
            session.setAttribute("name", n);

        if (validate(n, p)) {
            RequestDispatcher rd = request.getRequestDispatcher("home.jsp");
            rd.forward(request, response);
        } else {

            out.print("<p style=\"color:red\">Sorry username or password error</p>");
            RequestDispatcher rd = request.getRequestDispatcher("login.jsp");
            rd.include(request, response);
        }

        out.close();
    }

    public boolean validate(String name, String pass) {
        boolean status = false;

        try {
            String selectQuery = "select * from user where username="+"'"+name+"'"+" and password="+"'"+pass+"'";
            System.out.println(selectQuery);
            status = MysqlConnect.getDbCon().noOfRows(selectQuery);
            System.out.println("LoginController validate status " + status);
        } catch (Exception e) {
            System.out.println(e);
        }
        return status;
    }
}