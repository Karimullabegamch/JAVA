package prepinst;

import java.util.Scanner;

public class LeapYear {
	String meth1()
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter a year");
		int year=sc.nextInt();
		String ans;
		if((year%400==0) || ((year%4==0)&& (year%100 !=0)))
			ans=year+"leap year";
		else
			ans=year+" not a leap year";
		return ans;
	}
	public static void main(String[] args) {
		System.out.println(new LeapYear().meth1());
	}

}
