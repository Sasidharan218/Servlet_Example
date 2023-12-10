import java.io.*;
import java.sql.*;
import javax.servlet.ServletException;
import javax.servlet.http.*;

public class Register extends HttpServlet 
{
    private static final long serialVersionUID = 1L;

    public void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        response.setContentType("text/html");

        PrintWriter out = response.getWriter();
        String n = request.getParameter("userName");
        String p = request.getParameter("userPass");
        String e = request.getParameter("userEmail");
        String c = request.getParameter("userCountry");

        try 
        {

        Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/htmltodb?allowPublicKeyRetrieval=true&useSSL=false&serverTimezone=UTC","root", "");
        PreparedStatement ps = con.prepareStatement("insert into employee  (Name,Password,Email,Country) values(?,?,?,?)");

            ps.setString(1, n);
            ps.setString(2, p);
            ps.setString(3, e);
            ps.setString(4, c);

            int i = ps.executeUpdate();


            // build HTML code
            String htmlRespone = "<html>";
            htmlRespone += "</html>";
            if (i > 0)
                htmlRespone += ("<h1>Hi " + n + " ..... You are successfully registered...</h1>");
            else
                out.print("Please try again");
            out.println(htmlRespone);

            Statement stmt = con.createStatement();
            String strSelect = "select Name,Password,Email,Country from employee";
            System.out.println("The SQL statement is: " + strSelect + "\n"); 
            ResultSet rset = stmt.executeQuery(strSelect);
            System.out.println("The records selected are:");
            int rowCount = 0;
            while(rset.next()) 
            {  
            String Name = rset.getString("Name");
            String Password = rset.getString("Password");
            String Email   = rset.getString("Email");
            String Country =rset.getString("Country");
            htmlRespone +=Name+"&nbsp"+"&nbsp";  htmlRespone += Password+"&nbsp"+"&nbsp" ;  htmlRespone += Email+"&nbsp"+"&nbsp";  htmlRespone +=Country+"<br/>";
            out.println("\n");
            ++rowCount;
            }
           
            htmlRespone += "</html>";
            System.out.println(rowCount);
          
        // return response
        out.println(htmlRespone);





        } 
        catch (Exception e2) 
        {
            System.out.println(e2);
        }

        out.close();
    }
}