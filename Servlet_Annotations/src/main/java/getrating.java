import java.io.IOException;
import java.sql.*;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/sgetrating")

public class getrating extends HttpServlet
{
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException
    {
      
        String dbURL ="jdbc:mysql://localhost:3306/sqlassignment";
        String user ="root";
        String password = "";
 
        try (Connection conn = DriverManager.getConnection(dbURL, user, password);) 
        {
            System.out.println("try called at greeting invoked ");
            CallableStatement statement = conn.prepareCall("{call get_books(?)}");
            statement.setInt(1, 5);
 
            boolean hadResults = statement.execute();
 
            // print headings
            System.out.println("| Title | Description | Rating |");
            System.out.println("================================");
 
            while (hadResults) {
                ResultSet resultSet = statement.getResultSet();
 
                // process result set
                while (resultSet.next()) {
                    String title = resultSet.getString("title");
                    String description = resultSet.getString("description");
                    int rating = resultSet.getInt("rating");
 
                    System.out.println(
                            "| " + title + " | " + description + " | " + rating + " |");
                }
 
                hadResults = statement.getMoreResults();
            }
 
            statement.close();
 

           
 
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
   
    }
    
}