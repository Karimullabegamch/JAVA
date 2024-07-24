package prepinst;

import java.util.Scanner;

public class PerfectNum {


	String pnum()
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter a num");
		int num=sc.nextInt();
		int temp=num;
		int sum=0;
		for(int i=1;i<num;i++)
		{
			if(num%i==0)
			{
				sum=sum+i;
			}
		}
		if(temp==sum)
			return temp+"is  perfect number";
		return temp+" not a perfect number";
	}
	public static void main(String[] args) {
		System.out.println(new PerfectNum().pnum());;
	}
}
