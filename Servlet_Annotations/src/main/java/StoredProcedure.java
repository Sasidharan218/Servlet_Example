import java.io.IOException;
import java.sql.*;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/sprocedure")
/**
 * 1
 */
public class StoredProcedure extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        System.out.println("do get called");
        try {
            System.out.println("Hi Krishnan");
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/ebarter","root", "");
            CallableStatement stmt = con.prepareCall("{call insertuser1(?,?)}");
            stmt.setInt(1, 1011);
            stmt.setString(2, "Vinesh");
            stmt.execute();
            System.out.println("success");
        

        } 
        catch (Exception e) {
            // TODO: handle exception
        }
    }

}
