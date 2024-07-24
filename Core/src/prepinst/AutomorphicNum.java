package prepinst;

import java.util.Scanner;

public class AutomorphicNum {

	void autoNum()
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter a num");
		int num=sc.nextInt();
		
		long snum=num*num;
		int r=(int)snum%10;
		if(r==num)
			System.out.println("yes automorphic num");
		else
			System.out.println("no it is not automorphic num");
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new AutomorphicNum().autoNum();
	}

}
