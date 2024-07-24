package Exceptions;

public class ExceptionChanining {

	public static void main(String[] args) {
		System.err.println("hii");
		String s=null;
		try {
		int n=Integer.parseInt(s);
		System.out.println(n);
		}
		catch(NumberFormatException npe)
		{
		//	System.out.println("catch block");
			System.out.println(npe.toString());
			System.err.println(npe.getMessage());
			
			RuntimeException r=new RuntimeException(new NumberFormatException("this is the correct ans "));
			throw r;
		}
		
	}
}
