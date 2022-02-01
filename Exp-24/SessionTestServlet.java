
import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;

public class SessionTestServlet extends HttpServlet
{
	public void doGet(HttpServletRequest req,HttpServletResponse res) throws IOException,ServletException
	{
		res.setContentType("text/html");
		PrintWriter out = res.getWriter();
		
                Cookie ck[] = req.getCookies();
              
		String passed_value = ck[0].getValue();
		
		out.println("<h3>Value Passed through the Hidden Field from InitialServlet is :"+passed_value+"</h3>");
		out.close();
	
	}

}
