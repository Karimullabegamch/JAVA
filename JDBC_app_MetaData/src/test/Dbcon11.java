package test;

import java.sql.Connection;
import java.sql.DatabaseMetaData;
import java.sql.DriverManager;
import java.sql.ParameterMetaData;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;

public class Dbcon11 {
	void meth1()
	{
		try
		{
			Class.forName("oracle.jdbc.driver.OracleDriver");
			Connection con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","BATCH9AM","ORACLE");
		DatabaseMetaData dmd=con.getMetaData();
		System.out.println("******DATABASE METADATA******\n "+dmd);
		 
		System.out.println();
		PreparedStatement ps=con.prepareStatement("select * from emp");
		ParameterMetaData pmd=ps.getParameterMetaData();
		System.out.println("*******PARAMETER METADATA******");
		System.out.println(pmd);
		System.out.println();
		ResultSet rs=ps.executeQuery();
		ResultSetMetaData rsd=rs.getMetaData();
		System.out.println("*******RESULTSET METADATA******");
		System.out.println(rsd+"\n");
		System.out.println("*****EMP TABLE*****");
		System.out.println("TOTAL COLUMNS IN EMP TABLE "+rsd.getColumnCount());
		int i=1;
		while(i<=8)
		{
			System.out.println("Column"+i+" "+rsd.getColumnLabel(i));
		
		i++;}}
		catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	public static void main(String[] args) {
		new Dbcon11().meth1();
	}

}
