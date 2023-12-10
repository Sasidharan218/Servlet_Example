import java.io.IOException;
import java.sql.*;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


/**
 * Storedprocedure2
 */
@WebServlet("/sprocedure2")
public class devi extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException {
        System.out.println("deo get method called");
        try {
        
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/sqlassignment", "root", "");
            CallableStatement stmt=con.prepareCall("{call create_author(?,?,?)}");
            stmt.setInt(1, 18);
            stmt.setString(2, "devi");
            stmt.setString(3, "mary");
            stmt.execute();
            System.out.println("success");
        } catch (SQLException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
}
    
}