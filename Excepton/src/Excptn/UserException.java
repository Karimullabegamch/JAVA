package Excptn;

import java.util.Scanner;

  class InvalidAgeException extends Exception{
	  
	  public InvalidAgeException(String msg)
	  {
		  super(msg);
		 
	  }
	  public InvalidAgeException()
	  {
		
		 
	  }
	
	  
  }
  
public class UserException  {

	public static void main(String[] args)  {
		Scanner sc=new Scanner(System.in);
		
		System.out.println("enter age");
		int age=sc.nextInt();
//		if(age<18)
//			{
//			throw new InvalidAgeException()	;
//			}
//			else
//			{
//				System.out.println("u r eligible for vote");
//			}
//		try(sc)
//		{
//			int age=sc.nextInt();
//			if(age<18)
//			{
//			throw new InvalidAgeException("u r eligible after 18")	;
//			}
//			else
//			{
//				System.out.println("u r eligible for vote");
//			}
//		}
//		catch(Exception e)
//		{
//			System.err.print(e.getMessage());
//		}
	}
}
