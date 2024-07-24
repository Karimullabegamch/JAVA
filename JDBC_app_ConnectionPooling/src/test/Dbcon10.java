package test;

import java.sql.Connection;
import java.util.Scanner;
import java.util.Vector;

public class Dbcon10 {
	void meth1()
	{
		Scanner sc=new Scanner(System.in);
		try(sc;)
		{
			try
			{
				
				System.out.println("enter driver name");
				String dburl=sc.next();
				System.out.println("enter username ");
				String uname=sc.next();
				System.out.println("enter pwd");
				String pwd=sc.next();
				ConnectionPooling con=new ConnectionPooling(dburl,uname,pwd,new Vector<Connection>());
				con.createConnections(5);
				System.out.println("\n********* FIRST **********");
				Connection con1=con.useConnectionFromPool();
				System.out.println(con1);
				System.out.println("\n********* SECOND **********");
				Connection con2=con.useConnectionFromPool();
				System.out.println(con2);
		con.con1(con1);
		con.con1(con2);
			   con.con();
				}
			catch(Exception e)
			{
				e.printStackTrace();		}
			
			
		}
	}
	public static void main(String[] args) {
		new Dbcon10().meth1();
	}

}
