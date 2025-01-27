package Prepate_stmnt;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.Scanner;

public class Prepare_Stmnt {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		try
		{
			Class.forName("oracle.jdbc.driver.OracleDriver");
			
			Connection con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","BATCH9AM","ORACLE");
			
			PreparedStatement ps1=con.prepareStatement("insert into emp1 values(?,?)")	;
			PreparedStatement ps2=con.prepareStatement("select * from emp1");
			PreparedStatement ps3=con.prepareStatement("select * from emp1 where NUM=?");
			PreparedStatement ps4=con.prepareStatement("DELETE FROM EMP1 WHERE NUM=?");
			PreparedStatement ps5=con.prepareStatement("UPDATE EMP1 SET NAME =? WHERE NUM=?");
			while(true)
			{
				System.out.println(" **********select the choice **********");
				System.out.println("1.Add product\n2.select\n3.see by num \n4.delete row\n5.UPDATE ROWS\n 6.Exit");
				
				int n=sc.nextInt();
				
				switch(n)
				{
				case 1:
					System.out.println("enter name");
					String nam=sc.next();
					System.out.println("enter number");
					int num=sc.nextInt();
					ps1.setString(1, nam);
					ps1.setInt(2, num);
					
					 int k=ps1.executeUpdate();
					 if(k>0)
					 {
						 System.out.println("successfully values are inserted");
					 }
					break;
					
				case 2:
					ResultSet rs=ps2.executeQuery();
					while(rs.next())
					{
						System.out.println(rs.getString(1)+ " "+ rs.getInt(2) );
					}
					
					break;
				case 3:
					System.out.println("enter number");
					int num1=sc.nextInt();
					ps3.setInt(1, num1);
					
					ResultSet rs1=ps3.executeQuery();					
					while(rs1.next())
					{
						System.out.println(rs1.getString(1)+ " "+ rs1.getInt(2) );
					}
					break;
				case 4:
					System.out.println("enter number");
					int num2=sc.nextInt();
					ps4.setInt(1, num2);
					int l=ps4.executeUpdate();
					if(l>0)
						System.out.println("1 row is deleted");
					break;
				case 5:
					System.out.println("enter name");
					String nam1=sc.next();
					System.out.println("enter number");
					int num3=sc.nextInt();
					ps5.setString(1, nam1);
					ps5.setInt(2, num3);
					
					int m=ps5.executeUpdate();
					if(m>0)
						System.out.println("row updated susccefully ");
					else
						System.out.println("no filed");
					break;
				case 6:
					System.out.println("operation stopped");
					System.exit(0);
				default:
					System.out.println("invalid choice");
					break;
				}
			}
		}
		catch(Exception e)
		{
			System.out.println(e.getMessage());
		}
	}
}
