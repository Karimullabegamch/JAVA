package prepinst;

import java.util.Scanner;

public class ArmstrongNum {
	
	void meth1() {
	try
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter any number");
		int num=sc.nextInt();
		int sum=0;
		int temp=num;
		int r=0;
		while (num>0)
		{
			r=num%10;
			sum=r*r*r+sum;
			num=num/10;
			
		}
		if(temp==sum)
			System.out.println(temp+" armstrong number");
		else
			System.out.println(temp+" not a armstrong number");
	}
	catch(Exception e)
	{
		System.out.println("***ENTER NUMERIC CHARACTERS ONLY********");
	}
	}
	public static void main(String[] args) {
		new ArmstrongNum().meth1();
	}

}
