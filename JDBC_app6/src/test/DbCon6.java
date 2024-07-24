package test;
import java.sql.*;
import java.util.Scanner;
public class DbCon6 {
	
	
	void meth1()
	{
		Scanner sc=new Scanner(System.in);
		try(sc;){
		try {
		Class.forName("oracle.jdbc.driver.OracleDriver");
		
		Connection con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","BATCH9AM","ORACLE");
		Statement stm=con.createStatement();
		while(true)
		{
			
			System.out.println("1. to see table data");
			System.out.println("2. inserting data");
			System.out.println("3.update date");
			System.out.println("4.delete data");
			System.out.println("5.exit");
			System.out.println("\n");
			System.out.println("select any one option");
			int n=sc.nextInt();
			switch(n) {
			case 1:
				System.out.println("===========USER DETAILS=============");
				ResultSet rs=stm.executeQuery("Select * from emp1");
				while(rs.next())
				{
					System.out.println(rs.getString(1)+" "+rs.getInt(2)+"\n");
				}
						break;
			case 2:
				System.out.println("enter ename");
				String name=sc.next();
				System.out.println("enter id");
				int id =sc.nextInt()	;
				int k=stm.executeUpdate("insert into EMP1 values('"+name+"',"+id+")");
				if(k>0) {
					System.out.println("user added successfully.............");
				}
				
				break;
			case 3:
				System.out.println("enter ename");
				String ename=sc.next();
				System.out.println("enter id");
				int eid =sc.nextInt()	;
				int ke=stm.executeUpdate("Update  EMP1 set('"+ename+"',"+eid+")");
				if(ke>0) {
					System.out.println("user added successfully.............");
				}
				
				break;
			case 4:
				break;
			case 5:
				
				System.out.println("stopped");
				System.exit(0);
			default:
				System.out.println("invalid option");
				break;
			}
		}
		
		
		}
		catch (Exception e)
		{
			System.out.println(e.toString());
		}
	}

}
	public static void main(String[] args) {
		new DbCon6().meth1();
	}
}
