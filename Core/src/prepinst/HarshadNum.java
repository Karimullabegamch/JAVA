package prepinst;

import java.util.Scanner;

public class HarshadNum {
	
	void hNum()
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter a num");
		int num=sc.nextInt();
		int temp=num;
		int s=0;
		int r=0;
		while(num>0)
		{
			r=num%10;
			s=s+r;
			num=num/10;
		}
		if(temp%s==0)
			System.out.println("harshad number");
		else
			System.out.println("not a harshad number");
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new HarshadNum().hNum();
	}
}
