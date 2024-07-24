package STMNT_EXECUTE_UPDATE;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;
import java.util.Scanner;

public class STMNT_EXC_UPDATE {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		try(sc;)
		{
			System.out.println("enter name ");
			String nam=sc.next();
			
			System.out.println("enter number ");
			int num=sc.nextInt();
			
			Class.forName("oracle.jdbc.driver.OracleDriver");
			
			Connection con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","BATCH9AM","ORACLE");
			
			Statement stm=con.createStatement();
			
			int k=stm.executeUpdate("insert into EMP1 VALUES('"+nam+"',"+num+") ");
			if(k>0)
			{
				System.out.println("values inserted susccessfully ");
			}
			
			
		}
		catch(Exception e)
		{
			System.out.println(e.getMessage());
			
		}
	}
}
