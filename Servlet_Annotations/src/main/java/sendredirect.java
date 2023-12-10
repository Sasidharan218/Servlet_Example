import java.io.*;  
import javax.servlet.*;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.*;

@WebServlet("/sendgoogle")
public class sendredirect extends HttpServlet {
public void doGet(HttpServletRequest req,HttpServletResponse res)  
throws ServletException,IOException  
{  
res.setContentType("text/html");  
PrintWriter pw=res.getWriter();  
  
res.sendRedirect("http://www.google.com");  
  
pw.close();  
}} 