package Excptn;

public class ThrwngExcpt {
public static void main(String[] args) {
	

	System.out.println("main started=="+Thread.currentThread().getName());
	try {
		
		throw new ArithmeticException("divide by zero "+Thread.currentThread().getName());
	}
	catch(Exception e)
	{
		System.err.println(e.getMessage()+"== "+Thread.currentThread().getName());
		System.out.println("==============");
		e.printStackTrace();
	}
	System.out.println("main ended =="+Thread.currentThread().getName());
}
}
