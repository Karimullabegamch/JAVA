package test;
import java.util.Scanner;
import java.sql.*;


 // USING PREPARED STATEMENT SLECT ,UPDATE,INSERT AND DELETE OPERATIONS
public class DbCon7 {
	void meth1()
	{
		Scanner sc=new Scanner(System.in);
		try(sc;){
			try {
		Class.forName("oracle.jdbc.driver.OracleDriver");
		Connection con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","BATCH9AM","ORACLE");
		PreparedStatement ps1=con.prepareStatement("insert into BkDetails59 values(?,?,?,?)");
		PreparedStatement ps2=con.prepareStatement("select * from  BkDetails59 ");
		PreparedStatement ps3=con.prepareStatement("select * from  BkDetails59  where bcode=?");
		PreparedStatement ps4=con.prepareStatement("update BkDetails59 set bprice=? where bcode=? ");
		PreparedStatement ps5=con.prepareStatement("delete BkDetails59  where bcode=? ");
		while(true) {
			System.out.println("\n");
			System.out.println("1.Add Book details");
			System.out.println("2.view book details");
			System.out.println("3.View book details by code");
			System.out.println("4.update book details");
			System.out.println("5.delete book details");
			System.out.println("6.exit");
			System.out.println("\n");
			System.out.println("SELECT ANY OPTION");
			int op=sc.nextInt();
			switch(op)
			{
			case 1:
				System.out.println("enter book code");
				String bcode=sc.next();
				System.out.println("enter book name");
				String bname=sc.next();
				System.out.println("enter author name");
				String aname=sc.next();
				System.out.println("enter book price");
				int bprice =sc.nextInt();
				ps1.setString(1, bcode);
				ps1.setString(2, bname);
				ps1.setString(3, aname);
				ps1.setFloat(4, bprice);
				int k=ps1.executeUpdate();
				if(k>0)
				{
					System.out.println("book details added successfully.......");
				}
				break;
			case 2:
				System.out.println("===books========");
				ResultSet rs=ps2.executeQuery();
				while(rs.next())
					System.out.println(rs.getString(1)+" "+rs.getString(2)+" "+rs.getString(3)+" "+rs.getInt(4));;
				break;
			case 3:
				System.out.println("enter bcode");
				String bc=sc.next();
				ps3.setString(1, bc);
				ResultSet rs1=ps3.executeQuery();
				System.out.println("===books========");
				while(rs1.next())
					System.out.println(rs1.getString(1)+" "+rs1.getString(2)+" "+rs1.getString(3)+" "+rs1.getInt(4));;
				
				
				break;
			case 4:
				System.out.println("enter bcode");
				String bc1=sc.next();
				System.out.println("enter book price");
				int bp =sc.nextInt();
				ps4.setFloat(1,bp);
				ps4.setString(2, bc1);
				int k1 =ps4.executeUpdate();
				if(k1>0)
					System.out.println("*******updated succefully*******");
				
				
				break;
			case 5:
				System.out.println("enter bcode");
				String bc2=sc.next();
				ps5.setString(1, bc2);
				int k2 =ps5.executeUpdate();
				if(k2>0)
					System.out.println("*******deleted succefully*******");
				break;
			case 6:
				System.out.println("operation stopped");
			System.exit(0);
			default:
				System.out.println("invalid option");
				break;
			}
			
		}
			}
			catch(Exception e)
			{
			System.out.println(e.toString());	
			}
		}
		
		
	}
	
	public static void main(String[] args) {
		new DbCon7().meth1();
	}

}
