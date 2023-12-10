import java.io.IOException;
import java.sql.*;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/sprocedure1")
/**
 * 1
 */
public class storedprocedure1 extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        System.out.println("do get called");
        try {
            System.out.println("try called");
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/sqlassignment","root", "");
            CallableStatement stmt = con.prepareCall("{call create_author(?,?,?)}");
            stmt.setInt(1,10);
            stmt.setString(2," abi");
            stmt.setString(3, "abi@microsoft.com");
            System.out.println("three statements crossed");
            stmt.execute();
            System.out.println("success");
        } 
        catch (Exception e) {
            // TODO: handle exception
        }
    }

}
