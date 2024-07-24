package test;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class Dbcon2 {
// READING FROM PRODUCT59
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try
		{
			Class.forName("oracle.jdbc.driver.OracleDriver");
			Connection con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","BATCH9AM","ORACLE");
			Statement stm=con.createStatement();
			ResultSet rs=stm.executeQuery("SELECT * FROM PRODUCT59");
			System.out.println("=======PRD DETAILS======"
					);
			while(rs.next()) {
				System.out.println(rs.getInt(1)+"\t"+ rs.getString(2)+"\t"+rs.getInt(3)+"\t"+rs.getInt(4));
			}
			
			
		}
		catch(Exception e)
		{
			System.out.println(e.toString());
		}
	}

}
