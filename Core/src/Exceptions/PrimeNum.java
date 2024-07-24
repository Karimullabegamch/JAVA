package Exceptions;
import java.util.Scanner;

public class PrimeNum  {

	public static void main(String[] args) throws PrimeException {
		
		Scanner sc=new Scanner(System.in);
		System.out.println("enter a number ");
		int num=sc.nextInt();
		for(int i=2;i<num;i++)
		{
			if(num%i==0)
				throw new PrimeException("this is not a prime ");
		}
		System.out.println("prime number");

//		
//		for(int i=2;i<num;i++)
//		{
//		try
//		{
//			if(num%2==0)
//				throw new PrimeException("not a prime number");
//			else
//				System.out.println("prime number");
//				
//			
//		}
//		catch(Exception e)
//		{
//			e.printStackTrace();		}
//			
//			
//		}
		
		
	}
}
