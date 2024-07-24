package prepinst;

import java.util.Scanner;

public class StrongNumber {

	
	String snum()
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter a num");
		int num=sc.nextInt();
		int temp=num;
		int sum=0;
		while(num>0)
		{
			int r;
			
			int f=1;
			for(r=num%10;r>=1;r--) {
				f=f*r;
			}
			sum=sum+f;
	
			num=num/10;
		}
		if(sum==temp)
			return "yes it is a strong number";
	return "it is not a strong number";
		}
	
	public static void main(String[] args) {
		System.out.println(new StrongNumber().snum());;
	}

}
