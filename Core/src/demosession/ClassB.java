package demosession;

public class ClassB 
{
	void meth1()
	{
		System.out.println("meth1 called");
		int a=10;
		System.out.println(a);
		ClassB bobj =new ClassB();
		bobj.meth2();
	}
	void meth2()
	{
		System.out.println("meth2 called");
		int a=99;
		System.out.println(a);
	}
	public static void main(String[] args)
	{
		System.out.println("start");
		System.out.println("java is awesome");
		ClassB bobj=new ClassB();
		bobj.meth1();
		System.out.println("end");
	}
}
