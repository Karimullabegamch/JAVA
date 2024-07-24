package test;

import java.sql.Connection;
import java.sql.DriverManager;

import java.sql.Statement;
import java.util.Scanner;

public class Dbcon4 {
// INSERT INTO EMP59
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		try(sc;)
		{
			try {
				System.out.println("ENTER EID ");
				String id=sc.next();
				System.out.println("enter Ename  ");
				String name=sc.next();
				System.out.println("enter emp role  ");
				String edes=sc.next();
				System.out.println( "enter salary");
				long sal=sc.nextLong();
			 float hra=(0.93f)*sal;
				float da =(0.61f)*sal;
				float tsal=sal+hra+da;
				Class.forName("oracle.jdbc.driver.OracleDriver");
				Connection con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","BATCH9AM","ORACLE");
				Statement stm=con.createStatement();
				int k=stm.executeUpdate("insert into emp59 values ('"+id+"','"+name+"','"+edes+"',"+sal+","+hra+","+da+","+tsal+")");
				if(k>0)
				{
					System.out.println("user added suscces fully........");
				}
			}
			
			catch(Exception e)
			{
				System.out.println(e.toString());
			}
		}

	

	}

}
