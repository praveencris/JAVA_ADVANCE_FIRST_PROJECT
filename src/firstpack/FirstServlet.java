package firstpack;
import javax.servlet.*;
import javax.servlet.http.*;
import java.io.*;

public class FirstServlet extends HttpServlet {
	@Override
	public void service(HttpServletRequest req, HttpServletResponse res) throws IOException {
		PrintWriter out=res.getWriter();
		out.println("<font color=red>Welcome to Servlets</fonts>");
		out.println("<table> <tr>\r\n" + 
				"    <th>Month</th>\r\n" + 
				"    <th>Savings</th>\r\n" + 
				"  </tr>\r\n" + 
				"  <tr>\r\n" + 
				"    <td>January</td>\r\n" + 
				"    <td>$100</td>\r\n" + 
				"  </tr></table>");
		ServletContext sc=getServletContext();
		out.println(sc.getAttribute("val"));
	}
}