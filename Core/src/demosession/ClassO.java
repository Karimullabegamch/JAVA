package demosession;



public class ClassO 
{
	int meth1()
	{
		System.out.println("meth1 called");
		return 10;
	}
	int meth2()
	{
		System.out.println("meth2 called");
		return 20;
	}
	String meth3(int x,int y)
	{
		System.out.println("meth3 called");
		System.out.println("x : "+x);
		System.out.println("y : "+y );
		System.out.println("addition of :"+(x+y));
		new ClassO().meth4();
		return "java is awesome";
		
	}
	void meth4()
	{
		System.out.println("java is amazing");
	}
	public static void main(String[] args) {
		System.out.println("Start");
		ClassO obj=new ClassO();
		String msg=obj.meth3(obj.meth1(), obj.meth2());
		System.out.println(msg);
		System.out.println("end");
	}
}
