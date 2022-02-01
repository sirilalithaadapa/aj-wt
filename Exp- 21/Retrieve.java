
import javax.servlet.*;
import javax.servlet.http.*;
import java.sql.*;
import java.io.*;
import java.util.*;
public class Retrieve extends HttpServlet
{
public void service(HttpServletRequest req,HttpServletResponse res) throws ServletException,IOException
{
res.setContentType("text/html");
PrintWriter out=res.getWriter();
try{
Class.forName("oracle.jdbc.driver.OracleDriver");
Connection con=DriverManager.getConnection("jdbc:oracle:thin:@195.100.101.158:1521:cclab","scott","tiger");
Statement s=con.createStatement();
ResultSet r=s.executeQuery("select * from cart");
out.println("<center> <table border=1>");
out.println("<thead> <th> Book name </th> <th> Price </th> <th> Quantity </th> <th> Amount </th> </thead>");
while(r.next())
{
out.println("<tr> <td> "+r.getString(1)+"</td> ");
out.println("<td> "+r.getString(2)+"</td> ");
out.println("<td> "+r.getInt(3)+"</td> ");
out.println("<td> "+r.getString(4)+"</td> </tr>");
}
out.println("</table></center>");
con.close();
}
catch(SQLException sq)
{
out.println("sql exception"+sq);
}

catch(ClassNotFoundException cl)
{
out.println("class not found"+cl);
}
}
}
