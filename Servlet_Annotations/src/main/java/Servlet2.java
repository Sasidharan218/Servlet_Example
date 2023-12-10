import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletConfig;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebInitParam;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet1
 */
@WebServlet(
        urlPatterns = "/gotoservlet2",
        initParams =
        {
            @WebInitParam(name = "team", value = "UI Team"),
            
        }
)
public class Servlet2 extends HttpServlet 
{
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException 
    {
        System.out.println("H Krishnan");
        ServletContext context=req.getServletContext();
        context.setInitParameter("name", "KGiSL");
        ServletConfig config=getServletConfig();
       

        req.setAttribute("name", context.getInitParameter("name"));
        req.setAttribute("team",  config.getInitParameter("team"));
        
        RequestDispatcher rd=req.getRequestDispatcher("servlet2.jsp");
        rd.forward(req, resp);
    }

}