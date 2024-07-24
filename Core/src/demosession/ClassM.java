package demosession;

public class ClassM 
{
	int meth1()
	{
		System.out.println("meth1 called");
		return new ClassM().meth2();
		
	}
	int meth2()
	{
		System.out.println("meth2 called");
		return 40;
	}
	public static void main(String[] args) {
		System.out.println(new ClassM().meth1()+new ClassM().meth2());
	}

}
