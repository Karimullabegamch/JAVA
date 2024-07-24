package prepinst;

import java.util.Scanner;

public class SumInGivenRange {
	

	int meth1()
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter starting number");
		int snum1=sc.nextInt();
		System.out.println("enter ending number");
		int lnum1=sc.nextInt();
		
		int sum=0;
		for(int i=snum1;i<=lnum1;i++)
			sum=sum+i;
		sc.close();
		return sum;
	}
	public static void main(String[] args) {
		System.out.println(new SumInGivenRange().meth1());
	}
}
