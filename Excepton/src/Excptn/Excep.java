package Excptn;

public class Excep {

	void meth1()
	{
		System.out.println(2/0);
	}
	public static void main(String[] args) {
		try {
		new Excep().meth1();
		}
		catch(Exception e)
		{
			System.out.println("do not divide with zero");
		}
	}
}
