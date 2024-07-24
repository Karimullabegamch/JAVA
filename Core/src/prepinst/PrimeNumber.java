package prepinst;

import java.util.Scanner;

public class PrimeNumber {
	void meth1()
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter  number ");
		int num=sc.nextInt();
		int count=0;
		for(int i=2;i<num;i++)
		{
			if(num%i==0)
			count=count+1;
		}
		if (count==0)
			System.out.println(num+" prime number");
		else
			System.out.println(num+" not prime number");
		sc.close();
	}
	public static void main(String[] args) {
		new PrimeNumber().meth1(); 
	}

}
