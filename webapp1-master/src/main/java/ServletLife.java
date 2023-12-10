import java.io.IOException;
import java.io.PrintWriter;
  import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
  
public class ServletLife extends HttpServlet
{
  
    private static final long serialVersionUID = 1L;

    public ServletLife()
    {    
        System.out.println("Default constructor");
    }
  
    public void init(ServletConfig config)
    {
        System.out.println("Init method...!");
    }
  
    public void doGet(HttpServletRequest req,HttpServletResponse res)throws ServletException,IOException
    {    
        res.setContentType("text/html");
        PrintWriter pw = res.getWriter();
        pw.println("Hello, Krishnan EIE ...!");
        pw.close();
    }    
  
    public void destroy()
    {
        System.out.println("Destroy method");
    }
  
}


