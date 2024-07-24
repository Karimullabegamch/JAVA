package prepinst;

import java.util.Scanner;

public class GreatestOfTwo {
	int meth1()
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter any number");
		int num1=sc.nextInt();
		System.out.println("enter any number");
		int num2=sc.nextInt();
		
		int gnum=(num1>num2)?num1:num2;
		return gnum;
	}
	public static void main(String[] args) {
		System.out.println(new GreatestOfTwo().meth1()+" is greatest");
	}
}
