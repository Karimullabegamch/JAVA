package test;

import java.sql.*;

public class Dbcon1 {
// READING FROM EMP
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try
		{
			Class.forName("oracle.jdbc.driver.OracleDriver");
			Connection con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","BATCH9AM","ORACLE");
			Statement stm=con.createStatement();
			ResultSet rs=stm.executeQuery("SELECT * FROM EMP");
			while(rs.next()) {
				System.out.println(rs.getInt(1)+"\t"+ rs.getString(2));
			}
			
			
		}
		catch(Exception e)
		{
			System.out.println(e.toString());
		}

	}

}
