package prepinst;

import java.util.Scanner;

public class PrimeNumberGivenRange {
	void meth1()
	{
		Scanner sc=new Scanner(System.in);
		try {
			System.out.println("enter a start number ");
			int start=sc.nextInt();
			System.out.println("enter a end number ");
			int end=sc.nextInt();
		
		System.out.println("these are the prime numbers between "+start+"," +end);
		for(int j=start;j<=end;j++)
		{ int count=0;
			for(int i=2;i<j;i++)
			{
				if(j%i==0)
				count=count+1;
			}
			if (count==0)
			{
				
				System.out.print(j+" ");
			}
		}
		}
		catch(Exception e)
		{
			System.out.println("****enter numbers only*****");
		}
		finally
		{
			//System.out.println("resource closed");
		}
		sc.close();
	}
	public static void main(String[] args) {
		new PrimeNumberGivenRange().meth1(); 
	}
}
