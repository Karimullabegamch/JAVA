package test;
import java.sql.DriverManager;
import java.util.Scanner;
import java.sql.*;
public class DbCon3 {
// INSERT TO INTO PDCT59
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		try(sc;)
		{
			try {
				System.out.println("ENTER ID ");
				String id=sc.next();
				System.out.println("enter name  ");
				String name=sc.next();
				System.out.println("enter email id  ");
				String eid=sc.next();
				System.out.println( "enter ph no");
				long phno=sc.nextLong();
				Class.forName("oracle.jdbc.driver.OracleDriver");
				Connection con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","BATCH9AM","ORACLE");
				Statement stm=con.createStatement();
				int k=stm.executeUpdate("insert into pdct59 values ('"+id+"','"+name+"','"+eid+"',"+phno+")");
				if(k>0)
				{
					System.out.println("user added suscces fully........");
				}
			}
			catch(SQLIntegrityConstraintViolationException s)
			{
				System.out.println("user already exsits........");
			}
			catch(Exception e)
			{
				System.out.println(e.toString());
			}
		}

	}

}
