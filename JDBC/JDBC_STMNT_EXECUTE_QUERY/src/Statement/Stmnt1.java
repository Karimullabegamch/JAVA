package Statement;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;


public class Stmnt1 {

	public static void main(String[] args) throws Exception {
	
		Class.forName("oracle.jdbc.driver.OracleDriver");
		
		Connection con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","BATCH9AM","ORACLE");
		Statement stm=con.createStatement();
		
		ResultSet rs=stm.executeQuery("select * from emp");
		while(rs.next())
		System.out.println(rs.getString(2) +" "+rs.getInt(1));
		}
		
		
			
		
		
	
}
