import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/gotoServlet_2")

public class Servlet_2 extends HttpServlet
{
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException
    {
        System.out.println("Servlet2 doget called");
        resp.setContentType("text/html");
        PrintWriter out = resp.getWriter();
        Cookie ck[] = req.getCookies();
        out.print("Hello " + ck[0].getValue());
        out.close();

    }

}