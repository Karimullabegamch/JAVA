package test;
import java.util.Scanner;
import java.sql.*;

public class DbConProc2 {
	
	void meth1()
	{
		Scanner sc=new Scanner(System.in);
		try(sc;)
		{
			try
			{
				Class.forName("oracle.jdbc.driver.OracleDriver");
				Connection con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","BATCH9AM","ORACLE");
				CallableStatement cs=con.prepareCall("{CALL STU_DETAILS  (?,?,?,?,?,?,?,?,?,?,?)}");
				System.out.println("enter rool number");
				int rno=sc.nextInt();
				System.out.println("enter name ");
				String name=sc.next();
				System.out.println("enter branch");
				String branch=sc.next();
				System.out.println("enter city");
				String city=sc.next();
				System.out.println("enter state");
				String state=sc.next();
				System.out.println("entter pincode ");
				int pcode=sc.nextInt();
				System.out.println("enter mail id");
				String mid=sc.next();
				System.out.println("enter phno");
				int phno=sc.nextInt();
				
				System.out.println("enter sub1 marks");
				int sub1=sc.nextInt();
				System.out.println("enter sub2 marks");
				int sub2=sc.nextInt();
				System.out.println("enter sub3 marks");
				int sub3=sc.nextInt();
				int tmarks=sub1+sub2+sub3;
				int per =(tmarks/300)*100;
				
			    String grade;
			    
			    if (tmarks>270)
			    	grade="A";
			    else if (tmarks>250)
			    	grade="B";
			    else if (tmarks>200)
			    	grade="C";
			    else
			    	grade="F";
			    cs.setInt(1, rno);
			    cs.setString(2,name);
			    cs.setString(3,branch);
			    cs.setString(4,city);
			    cs.setString(5,state);
			    cs.setInt(6,pcode);
			    cs.setString(7,mid);
			    cs.setInt(8, phno);
			    cs.setInt(9,tmarks);
			    cs.setInt(10, per);
			    cs.setString(11, grade);
			    cs.execute();
			    	
				
				System.out.println("student added succefully ........");
			}
			catch(Exception e)
			{
				e.printStackTrace();
			}
		}
	}

	public static void main(String[] args) {
	  new DbConProc2().meth1();

	}

}
