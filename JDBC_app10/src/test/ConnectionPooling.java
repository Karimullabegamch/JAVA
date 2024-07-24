/*
import java.sql.Connection;
import java.sql.DriverManager;
import java.util.Iterator;
import java.util.Vector;
public class ConnectionPooling {

public	String url,uname,pwd;
	public Vector<Connection> v;
	
	ConnectionPooling(String url,String uname,String pwd,Vector<Connection> v)
	{
		this.url=url;
		this.uname=uname;
		this.pwd=pwd;
		this.v=v;
	}
	 void createConnections(int n)
	 {
		 try {
			 while(v.size()<n)
			 {
				 Connection con=DriverManager.getConnection(url,uname,pwd);
				 System.out.println(con);
				 v.add(con);
				 
			 }
			 
			 if(v.size()==n)
			 {
				 System.out.println("pool is fulled \n");
			 }
		 }
	 
		 catch(Exception e)
		 {
			 e.printStackTrace();
		 }
		
		
	 }
	 public Connection useConnectionFromPool()
	 {
		 Connection con =v.get(0);
		 v.removeElementAt(0);
		 System.out.println("after removing size: "+v.size());
		 return con;
	 }
	 void con()
	 {
		
	Iterator<Connection> i=	 v.iterator();
	while(i.hasNext())
	{
		System.out.println(i.next());
	}
	
	 }
	void con1(Connection c)
	{
		v.add(c);
		System.out.println("\n after adding size: "+v.size());
	}
}*/
