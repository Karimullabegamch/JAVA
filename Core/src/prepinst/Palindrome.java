package prepinst;

import java.util.Scanner;

public class Palindrome {
	String meth1()
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter any number");
		int num=sc.nextInt();
		int temp=num;
		int sum=0;
		int rem=0;
		while(num>0)
		{
			rem=num%10;
			
			sum=sum*10+rem;
			
			num=num/10;
			
		}
		String  ans;
		if (temp==sum)
			ans="Palindrome";
		else
			ans="not a palindrome";
		sc.close();
		return ans;
		
	}
	public static void main(String[] args) {
		
		System.out.println(new Palindrome().meth1());
	}

}
