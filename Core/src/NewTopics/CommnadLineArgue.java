package NewTopics;

public class CommnadLineArgue {

//	public static void main(String[] args) {
//		System.out.println(args[0]);
//		System.out.println(args[0]);
//		
//	}
	
	public static void main(String[] s) {
		System.out.println(s[0]);
		System.out.println(s[1]);
		System.out.println(s[0]+s[1]);
		
		int a=Integer.parseInt(s[0]);
		int b=Integer.parseInt(s[1]);
		System.out.println(a+b);
		
	}
}
/*
what we passing to the main method as a parameter called as command line arguement
with the help of cmd arguement we can pass values at run time

advantage is one time compilation and many times execution

that is String because string is the combination of different character so java people decide as string

we can convert string to int ==> using parsetInt(string) method that is static public method present in Integer class

parseInt() method accepts only one arguement that is string only

int a = Integer.parseInt("3")





*/