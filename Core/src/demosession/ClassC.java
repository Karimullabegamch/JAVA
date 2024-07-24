package demosession;

public class ClassC 
{
	void meth1()
	{
		int x=10;
		System.out.println("meth1 ic called");
		System.out.println(x);
		System.out.println(x+90);
		System.out.println(10+90);
		ClassC cobj=new ClassC();
		cobj.meth2();
		System.out.println("x");
		System.out.println("x+90");
		System.out.println("x : " +x);
	
	}
	void meth2()
	{
		System.out.println("meth2 called");
		int x=99;
		System.out.println(x);
		ClassC cobj=new ClassC();
		cobj.meth3();
		System.out.println(100-x);
		
	}
	void meth3()
	{
		System.out.println("java is awesome");
	}
	public static void main(String[] args) {
		System.out.println("start");
		ClassC cobj=new ClassC();
		cobj.meth1();
		System.out.println("end");
	}
}
