package prepinst;

import java.util.Scanner;

public class FibonaciSeries {
	void meth1()
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter number ");
		int num=sc.nextInt();
		int a=0;
		int b=1;
		System.out.print(a+","+b);
		for(int i=0;i<(num-2);i++)
		{
			
			int c=a+b;
			a=b;
			b=c;
			System.out.print(","+c);
			
			
		}
		System.out.println(".");
		
	}

	public static void main(String[] args) {
		new FibonaciSeries().meth1();
	}
}
