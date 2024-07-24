package test;
import java.io.*;

import jakarta.servlet.*;
import jakarta.servlet.annotation.*;
@SuppressWarnings("serial")
@WebServlet("/dis")
public class DisplayServlet  extends GenericServlet{

	public void init() throws ServletException
	{
		
	}
	public void service(ServletRequest rq,ServletResponse rs) throws ServletException,IOException
	{
		PrintWriter pw=rs.getWriter();
	rs.setContentType("text");
	String name=rq.getParameter("uname");
	String addrs=rq.getParameter("addr");
	String mid=rq.getParameter("mail");
	String pno=rq.getParameter("pno");
	String id=rq.getParameter("id");
	//System.out.println("==details===");
	pw.println("details");
	pw.println("name:"+name);
	pw.println("addr:"+addrs);
	pw.println("mid:"+mid);
	pw.println("pno:"+pno);
	pw.println("id:"+id);
	
	}
	}


