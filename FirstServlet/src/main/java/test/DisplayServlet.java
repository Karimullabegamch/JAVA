package test;

import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.GenericServlet;
import jakarta.servlet.ServletException;
import jakarta.servlet.ServletRequest;
import jakarta.servlet.ServletResponse;
import jakarta.servlet.annotation.WebServlet;

@WebServlet("/dis")


public class DisplayServlet extends GenericServlet {
	
	
public void init() throws ServletException
 {
 }
public void service(ServletRequest req,ServletResponse res) throws ServletException,IOException{
	PrintWriter pw=res.getWriter();
	res.setContentType("text/html");
	String uName=req.getParameter("uname");
	String mid=req.getParameter("mid");
	pw.println("================details=============");
pw.println("<br> User name :"+uName);
pw.println("<br> mail id :"+mid);


}
public void destroy()
{
	
}
}

