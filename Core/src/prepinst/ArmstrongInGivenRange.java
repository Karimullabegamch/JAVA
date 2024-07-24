package prepinst;

import java.util.Scanner;

public class ArmstrongInGivenRange {
	void meth1() {
		try
		{
			Scanner sc=new Scanner(System.in);
			System.out.println("enter any number");
			int start=sc.nextInt();
			
			System.out.println("enter another number ");
			int end=sc.nextInt();
			
			for(int i=start;i<=end;i++)
			{
				int sum=0;
				int r=0;
				int temp=i;
				
			while (temp>0)
				{
					r=temp%10;
					sum=r*r*r+sum;
					temp=temp/10;
					
				}
				if(i==sum)
					System.out.println(i);
				
			}
		}
		catch(Exception e)
		{
			System.out.println("***ENTER NUMERIC CHARACTERS ONLY********");
		}
		}
		public static void main(String[] args) {
			new ArmstrongInGivenRange().meth1();
		}


}
