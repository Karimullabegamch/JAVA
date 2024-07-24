package demosession;

public class ClassG
{
	void meth1(int a,String s)
	{
		System.out.println("hii");
		System.out.println(a);
		ClassG obj=new ClassG();
		obj.meth2(100,'z');
		System.out.println(s);
	}
	void meth2(int a,char c)
	{
		System.out.println("hello");
		System.out.println(a);
		System.out.println(c);
	}
	public static void main(String[] args) {
		ClassG obj=new ClassG();
		obj.meth1(50,"java is awesome");
		System.out.println("end");
	}
}
