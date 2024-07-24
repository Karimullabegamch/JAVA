package prepinst;

import java.util.Scanner;

public class EvenOdd {

	String meth1()
	{
		Scanner sc =new Scanner(System.in);
		System.out.println("enter any number");
		int num=sc.nextInt();
		String ans;
		// String ans=(num%2==0)?"Even Number":"Odd Number";
		 if (num%2==0)
			 ans="even number";
		 else
			 ans="odd number";
			
		 sc.close();
		return ans;
	}
	public static void main(String[] args) {
		System.out.println(new EvenOdd().meth1());
	}
}
