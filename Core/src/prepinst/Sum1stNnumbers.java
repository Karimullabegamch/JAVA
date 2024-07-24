package prepinst;

import java.util.Scanner;

public class Sum1stNnumbers {

	int meth1()
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter any number");
		int num=sc.nextInt();
		int sum=0;
		for(int i=1;i<=num;i++)
			sum=sum+i;
		sc.close();
		return sum;
	}
	
	public static void main(String[] args) {
		System.out.println(new Sum1stNnumbers().meth1());
	}
}
