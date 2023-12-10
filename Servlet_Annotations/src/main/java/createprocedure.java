import java.io.IOException;
import java.sql.*;

import javax.servlet.HttpConstraintElement;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * createprocedure
 */
@WebServlet("/cprocedure")
public class createprocedure extends HttpServlet
{
@Override
protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException
{
   
    String dbURL = "jdbc:mysql://localhost:3306/sqlassignment";
    String user = "root";
    String password = "";

    try (Connection conn = DriverManager.getConnection(dbURL, user, password);  Statement statement = conn.createStatement();) 
        {

        String queryDrop = "DROP PROCEDURE IF EXISTS delete_book";

        String queryCreate = "CREATE PROCEDURE delete_book (IN x INT) ";
        queryCreate += "BEGIN ";
        queryCreate += "DELETE FROM book WHERE book_id = x; ";
        queryCreate += "END";

        // drops the existing procedure if exists
        statement.execute(queryDrop);

        // then creates a new stored procedure
        statement.execute(queryCreate);

        statement.close();

        System.out.println("Stored procedure created successfully!");

    } catch (SQLException ex) {
        ex.printStackTrace();
    } 
}
}