package prepinst;

import java.util.Scanner;

public class PostiveNum {

	 String meth1()
	 {
		 Scanner sc=new Scanner(System.in);
		 System.out.println("enter any value");
		 int num=sc.nextInt();
		 String ans;
		// String ans=(num>0)? "positive":"negative"; == using ternary operator
		 if (num>0)
			 ans="positive Number";
		 else if (num<0)
			 ans="negative number";
		 else
			 ans="zero";
		 sc.close();
			 
		 return ans;
	 }
	
	
	public static void main(String[] args) {
		System.out.println(new PostiveNum().meth1());
	}
}
