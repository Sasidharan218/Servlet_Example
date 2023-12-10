import java.io.*;
import java.sql.*;
import javax.servlet.ServletException;
import javax.servlet.http.*;

public class ApplicationRegister extends HttpServlet 
{
    private static final long serialVersionUID = 1L;

    public void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        response.setContentType("text/html");

        PrintWriter out = response.getWriter();
        String n = request.getParameter("userName");
        String p = request.getParameter("userPass");
      
        try 
        {

   String url = "jdbc:mysql://localhost:3307/";
        String dbName = "testDB";
        String driver = "com.mysql.jdbc.Driver";
        String userName = "sammy3";
        String password = "password";
        System.out.println("url+dbName :: "+url+dbName);
        Connection con = DriverManager.getConnection(url+dbName+"?allowPublicKeyRetrieval=true&useSSL=false&serverTimezone=UTC",userName,password);
         con.setReadOnly(false);
        PreparedStatement ps = con.prepareStatement("insert into login (Username,Password) values(?,?)");

            ps.setString(1, n);
            ps.setString(2, p);
            int i = ps.executeUpdate();


            // build HTML code
            String htmlRespone = "<html>";
            htmlRespone += "</html>";
            if (i != 0)
                htmlRespone += ("<h1>Hi " + n + " ... You are successfully registered...</h1>");
                else
                out.print("Please try again");
            
                out.println(htmlRespone);
            
            }

        catch (Exception e2) 
        {
            System.out.println(e2);
        }

        out.close();
    }
}