package CALLABLE_STM;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.util.Scanner;

public class CallableStm {
public static void main(String[] args) {
	
	Scanner sc=new Scanner(System.in);
			try(sc;)
			{
				Class.forName("oracle.jdbc.driver.OracleDriver");
				
				Connection con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","BATCH9AM","BATCH9AM");
				
				CallableStatement cs=con.prepareCall("{call STUPROC (?,?,?,?,?,?)}");
				CallableStatement cs1=con.prepareCall("{call STURET (?,?,?,?,?,?)}");
				
				System.out.println("enter roll number");
				int rno=sc.nextInt();
				System.out.println("enter name");
				String nam=sc.next();
				System.out.println("enter branch");
				String br=sc.next();
				System.out.println("enter city");
				String city=sc.next();
				System.out.println("enter state");
				String st=sc.next();
				System.out.println("enter pincode");
				int pin=sc.nextInt();
				
				cs.setInt(1, rno);
				cs.setString(2, nam);
				cs.setString(3,br);
				cs.setString(4,city);
				cs.setString(5, st);
				cs.setInt(6, pin);
				cs.execute();
				System.out.println("data inserted successfully");
				
				System.out.println("======");
				
				System.out.println("RETRIEVING THE DATA");
				
				
			}
	catch(Exception e)
	{
		System.out.println(e.getMessage());
	}
}
}
