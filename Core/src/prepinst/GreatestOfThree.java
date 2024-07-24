package prepinst;

import java.util.Scanner;

public class GreatestOfThree {
	int meth1()
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter any number");
		int num1=sc.nextInt();
		System.out.println("enter any number");
		int num2=sc.nextInt();
		System.out.println("enter any number");
		int num3=sc.nextInt();
		
		int gnum=(num1>num2)?num1:num2;
		if (gnum<num3)
			gnum=num3;
		return gnum;
	}
	public static void main(String[] args) {
		System.out.println(new GreatestOfThree ().meth1()+" is greatest");
	}
}
