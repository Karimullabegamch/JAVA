package prepinst;

import java.util.Scanner;

public class FactorialNum {
	void meth1()
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter number : ");
		int num=sc.nextInt();
		int fact=1;
		for(int i=num;i>0;i--)
		{
			fact=fact*i;
		}
		System.out.println(fact);
	}

	public static void main(String[] args) {
		new FactorialNum().meth1();
	}
}
