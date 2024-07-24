package prepinst;

import java.util.Scanner;

public class ReverseOfNum {

	int meth1()
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter any number");
		int num=sc.nextInt();
		int ans=0;
		int rem=0;
		while(num>0)
		{
			rem=num%10;
			
			ans=ans*10+rem;
			
			num=num/10;
			
		}
		sc.close();
		return ans;
		
	}
	public static void main(String[] args) {
		
		System.out.println("reverse of the number is "+new ReverseOfNum().meth1());
	}
}
