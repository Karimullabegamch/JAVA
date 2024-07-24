package test;
import java.util.Scanner;
import java.sql.*;
public class Dbcon9 {

	
	void meth1()
	{
		Scanner sc=new Scanner(System.in);
		try(sc;)
		{
			try {
				//Class.forName("oracle.jdbc.driver.OracleDriver");
				Class.forName("oracle.jdbc.driver.OracleDriver");
				Connection con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","BATCH9AM","ORACLE");
				CallableStatement cs=con.prepareCall("{call EMP_DETAILS(?,?,?,?,?,?,?,?,?,?)}");
				System.out.println("enter id");
				String id=sc.next();
				System.out.println("enter name");
				String name=sc.next();
				System.out.println("enter designation");
				String des=sc.next();
				System.out.println("enter city");
				String city=sc.next();
				System.out.println("enter state");
				String state=sc.next();
				System.out.println("enter pincode");
				int pcode=sc.nextInt();		
				System.out.println("enter mailid");
				String mid=sc.next();
				System.out.println("entr phno");
				long phno=sc.nextLong();	
				System.out.println("enter salary");
				
			float sal=sc.nextFloat();
				float tsal=sal;
				cs.setString(1,id);
				cs.setString(2,name);
				cs.setString(3,des);
				cs.setString(4,city);
				cs.setString(5,state);
				cs.setInt(6,pcode);
				cs.setString(7,mid);
				cs.setLong(8, phno);
				cs.setFloat(9, sal);
				cs.setFloat(10,tsal);
				cs.execute();
				System.out.println("======successfully procedure executed========");
			}
			catch(Exception e)
			{
				e.printStackTrace();			}
		}
	}
	public static void main(String[] args) {
		new Dbcon9().meth1();
	}
}
