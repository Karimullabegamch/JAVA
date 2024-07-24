package prepinst;

import java.util.Scanner;

public class PerfSqr {

	String pnum()
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter a num");
		int num=sc.nextInt();
		if(Math.ceil(Math.sqrt(num))==Math.floor(Math.sqrt(num)))
		return "true";
	return "false";
	}
	public static void main(String[] args) {
		System.out.println(new PerfSqr().pnum());;
	}
}
