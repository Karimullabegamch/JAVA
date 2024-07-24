package Exceptions;

import java.util.Scanner;



public class RuntimeExcp {
	public static void main(String[] args)  {
		Scanner sc=new Scanner(System.in);
		
		System.out.println("enter age");
		int age=sc.nextInt();
		if(age<18)
			{
			throw new InvalidAgeException()	;
			}
			else
			{
				System.out.println("u r eligible for vote");
			}
}}
class InvalidAgeException extends RuntimeException{
	  
	  public InvalidAgeException(String msg)
	  {
		  super(msg);
		 
	  }
	  public InvalidAgeException()
	  {
		
		 
	  }
	
	  
}


	