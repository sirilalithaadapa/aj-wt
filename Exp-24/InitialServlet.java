import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;;

public class InitialServlet extends HttpServlet
{
	public void doPost(HttpServletRequest req,HttpServletResponse res) throws IOException,ServletException
	{
		res.setContentType("text/html");
		PrintWriter out = res.getWriter();
		String test = req.getParameter("test");
		out.println("<h3> Given Test Field Value is : "+test+" </h3> ");
                Cookie ck = new Cookie("test",test);
                res.addcookie(ck);
		out.println("<form action=SessionTestServlet><input type=submit value=SessionTestServlet></form>");
		out.close();
	}

}
