package login;

import javax.servlet.*;
import javax.servlet.http.*;
import java.io.*;



public class LoginServlet extends HttpServlet {

	
	RequestDispatcher dis=null;
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
	
		PrintWriter out=resp.getWriter();
		String login=req.getParameter("tLogin");
		String pass=req.getParameter("tPassword");
		
		System.out.println(login+"::"+pass);
		if(login.equals("admin")&&pass.equals("admin")){
			
			HttpSession ses=req.getSession(true);
			//Will create new session if session does not exist in project otherwise use existing session
			ses.setAttribute("loginval", login);
			out.println("Session id is "+ses.getId());
			
		/*	int x=5;
			ServletContext sc=getServletContext();
			sc.setAttribute("val", x);
			out.println("Value set in varaibale "+x);*/
			/*dis=getServletContext().getRequestDispatcher("/Welcome");
			dis.forward(req, resp);*/
		
		}else {
			dis=getServletContext().getRequestDispatcher("/Login.html");
			dis.include(req, resp);
			out.println("Invalid id or password ");
		}
	}

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
	
		PrintWriter out=resp.getWriter();
		String login=req.getParameter("tLogin");
		String pass=req.getParameter("tPassword");
		
		System.out.println(login+"::"+pass);
		if(login.equals("admin")&&pass.equals("admin")){
			
			HttpSession ses=req.getSession(true);
			//Will create new session if session does not exist in project otherwise use existing session
			ses.setAttribute("loginval", login);
			out.println("Session id is "+ses.getId());
			
		/*	int x=5;
			ServletContext sc=getServletContext();
			sc.setAttribute("val", x);
			out.println("Value set in varaibale "+x);*/
			/*dis=getServletContext().getRequestDispatcher("/Welcome");
			dis.forward(req, resp);*/
		
		}else {
			dis=getServletContext().getRequestDispatcher("/Login.html");
			dis.include(req, resp);
			out.println("Invalid id or password ");
		}
	}

	
	
}
