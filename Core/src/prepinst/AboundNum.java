package prepinst;

import java.util.Scanner;

public class AboundNum {

	void abouNum()
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter a num");
		int num=sc.nextInt();
		int s=0;
		for(int i=1;i<num;i++)
		{
			
			if(num%i==0)
				s=s+i;
			
		}
		System.out.println((s-num)+" aboundance ");
		if(s>num)
			System.out.println("aboundant num");
		else
			System.out.println("not a aboundant num");
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new AboundNum().abouNum();
	}
}
