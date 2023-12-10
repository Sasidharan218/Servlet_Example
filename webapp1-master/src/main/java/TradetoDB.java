import java.io.*;
import java.sql.*;
import javax.servlet.ServletException;
import javax.servlet.http.*;

public class TradetoDB extends HttpServlet {
    private static final long serialVersionUID = 1L;

    public void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        response.setContentType("text/html");

        PrintWriter out = response.getWriter();
        String id = request.getParameter("id");
        String ucccode = request.getParameter("ucccode");
        String scrip = request.getParameter("Scrip");
        String tdate = request.getParameter("tdate");
        String tradetype = request.getParameter("tradetype");
        String quantity = request.getParameter("quantity");
        String tprice = request.getParameter("tprice");
        System.out.println(id + " " + ucccode + " " + scrip + " " + tdate + " " + tradetype + " " + quantity + tprice);

        try {

            
        Connection con = DriverManager.getConnection(
            "jdbc:mysql://localhost:3306/htmltodb?allowPublicKeyRetrieval=true&useSSL=false&serverTimezone=UTC",
            "root", "");
            PreparedStatement ps = con.prepareStatement(
                    "insert into trade (Id,Ucccode,Scrip,TradeDate,TradeType,Quantity,TradePrice) values(?,?,?,?,?,?,?)");
            ps.setInt(1, Integer.parseInt(id));
            ps.setString(2, ucccode);
            ps.setString(3, scrip);
            ps.setString(4, tdate);
            ps.setString(5, tradetype);
            ps.setInt(6, Integer.parseInt(quantity));
            ps.setInt(7, Integer.parseInt(tprice));

            int i= ps.executeUpdate();
            System.out.println(i);
        } catch (NumberFormatException e) {
            
            e.printStackTrace();
        } catch (SQLException e) {
           
            e.printStackTrace();
        }
       
       
         out.close();

    }
  }

