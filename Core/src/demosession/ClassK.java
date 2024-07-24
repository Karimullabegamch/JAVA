package demosession;

public class ClassK 
{
	int meth1()
	{
		System.out.println("hii");
		int x=new ClassK().meth2();
		System.out.println(x/2);
		return 1;
	}
	int meth2()
	{
		System.out.println("hello");
		String s=new ClassK().meth3();
		System.out.println(s);
		return 50;
		
	}
	String meth3()
	{
		System.out.println("java is awesome");
		return "heeloo woeld";
		
	}
	public static void main(String[] args) {
		System.out.println(new ClassK().meth1());
	}
}