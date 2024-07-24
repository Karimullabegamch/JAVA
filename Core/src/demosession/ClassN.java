package demosession;

public class ClassN 
{
	void meth1()
	{
		System.out.println(10);
		System.out.println(54);
		System.out.println("End");
	}
	int meth2(int a,int b,int c)
	{
		System.out.println(a);
		ClassN obj=new ClassN();
		String s=obj.meth5(100,"java is awesome");
		System.out.println(s);
		return a-b;
	}
	String meth3(String s, int b, int d)
	{
		System.out.println(b+d);
		return s;
	}
	int meth4(int c,int k)
	{
		System.out.println(k);
		ClassN obj=new ClassN();
		int res=obj.meth2(50, 50, 50);
		System.out.println(res);
		return k+10;
	}
	String meth5(int a ,String l)
	{
		System.out.println(a+a);
		ClassN obj=new ClassN();
		String s=obj.meth3("hii" , 15,10);
		System.out.println(s);
		return l;
	}
	public static void main(String[] args) {
		ClassN obj=new ClassN();
		System.out.println("Start");
		int res=obj.meth4(20,10);
		System.out.println(res);
		obj.meth1();	}

}
