import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/gotoServlet_1")

public class Servlet_1 extends HttpServlet
{
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        System.out.println("Servlet1 doget called");
        resp.setContentType("text/html");
        PrintWriter out = resp.getWriter();
        String n = req.getParameter("userName");
        out.print("Name of Text Field : "+n);
        Cookie ck = new Cookie("userName", n);
       // ck.setMaxAge(60);
        resp.addCookie(ck);
        out.print("<form action='/gotoServlet_2'>");
        out.print("<input type='submit' value='continue'>");
        out.print("</form>");
        out.close();
    }

}