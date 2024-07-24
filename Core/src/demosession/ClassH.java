package demosession;

public class ClassH 
{
	void meth1(int a,int b)
	{
		ClassH obj=new ClassH();
		System.out.println(a-1);
		System.out.println(b);
		obj.meth4(10,2,2);

	}
	void meth2(int x)
	{
		ClassH obj=new ClassH();
		System.out.println((x));
		obj.meth1(10, 10);
		System.out.println(x+9);
	}
	void meth3(int x,int y)
	{
		System.out.println(x*y);
		ClassH obj=new ClassH();
		System.out.println(y);
		obj.meth2(1);
	}
	void meth4(int a,int b,int c)
	{
		System.out.println(a+b);
		System.out.println(a-b);
		System.out.println(a*b);
		System.out.println(a/c);
	}
	public static void main(String[] args) {
		ClassH obj=new ClassH();
		obj.meth3(5, 2);
	}
}
