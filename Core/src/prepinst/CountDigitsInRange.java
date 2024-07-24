package prepinst;

import java.util.Scanner;

public class CountDigitsInRange {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter a number ");
		int num=sc.nextInt();
		int count=0;
		if(num<10)
		{
			count=num;	
		}
		else {
			for(int i=1;i<=num;i++)
			{ int n=i;
				while(n>0)
				{
					
					count++;
					n=n/10;
				}
			}
		}
		System.out.println(count);
		
	}
}
