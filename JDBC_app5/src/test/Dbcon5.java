package test;
import java.sql.*;
public class Dbcon5 {

	//READING DETAILS FROM EMP59
	public static void main(String[] args) {
		try
		{
			Class.forName("oracle.jdbc.driver.OracleDriver");
			Connection con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","BATCH9AM","ORACLE");
			Statement stm=con.createStatement();
			ResultSet rs=stm.executeQuery("select * from emp59");
			while(rs.next())
			{
				System.out.println(rs.getString(1)+" "+rs.getString(2)+"  "+rs.getString(3)+"  "+rs.getInt(4)+"  "+rs.getFloat(5)+" "+rs.getFloat(6));
			}
			
		}
		catch(Exception e)
		{
			System.out.println(e.toString());
		}
	}
}
