package demosession;

public class ClassP 
{
	int meth1(int a,int b)
	{
		System.out.println(a);
		System.out.println(a-b);
		return new ClassP().meth4(a-1,"hii");
		
	}
	String meth2(int x)
	{
		System.out.println(x-new ClassP().meth1(200, 199));
		System.out.println(x);
		return "java";
	}
	String meth3(int a,int b,String s)
	{
		System.out.println(a);
		System.out.println(a+a);
		System.out.println(a+b);
		return s;
	}
	int meth4(int a,String s)
	{
		System.out.println(a);
		System.out.println(s);
		return a+a;
		
	}
	String meth5(String s)
	{
		return s;
	}
	public static void main(String[] args) {
		System.out.println(new ClassP().meth3(15,25,new ClassP().meth2(500)));
		
	}
}
