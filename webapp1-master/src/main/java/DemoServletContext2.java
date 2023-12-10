import java.io.*;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletConfig;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class DemoServletContext2 extends HttpServlet
{

    private static final long serialVersionUID = 1L;

    public void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        response.setContentType("text/html");
        PrintWriter out = response.getWriter();

        ServletContext context = getServletContext();
        String name = context.getInitParameter("user_name");
        request.setAttribute("name", name);
        
        ServletConfig config=getServletConfig();
        String text2=config.getInitParameter("Mycompany");
        request.setAttribute("text1", text2);
        System.out.println(text2);

        RequestDispatcher requestDispatcher = request.getRequestDispatcher("hello.jsp");
        requestDispatcher.forward(request, response);
        out.close();

    }

 
}
