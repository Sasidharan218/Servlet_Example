import java.io.IOException;
import java.sql.*;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * 1
 */
@WebServlet("/summaryreport")
public class StoredProcedureSummaryReport extends HttpServlet 
{
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException
    {
        
        
        String dbURL = "jdbc:mysql://localhost:3306/sqlassignment";
        String user = "root";
        String password = "";
 
        try (
            Connection conn = DriverManager.getConnection(dbURL, user, password);
            CallableStatement statement = conn.prepareCall("{call summary_report(?, ?, ?, ?)}");
        ) {
            System.out.println("try called at StoredProcedureSummaryReport ");
            statement.setString(1, "Java");
            statement.registerOutParameter(2, Types.INTEGER);
            statement.registerOutParameter(3, Types.DOUBLE);
            statement.registerOutParameter(4, Types.DOUBLE);
            statement.setDouble(4, 50);
 
            statement.execute();
 
            Integer totalBook = (Integer) statement.getObject(2, Integer.class);
            Double totalValue = statement.getDouble(3);
            Double highPrice = statement.getDouble("highPrice");
 
            System.out.println("Total books: " + totalBook);
            System.out.println("Total value: " + totalValue);
            System.out.println("High price: " + highPrice);
 
 
            statement.close();
 
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
    }
    
}     
        
        
        
        
        