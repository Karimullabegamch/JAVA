package demosession;

public class ClassF 
{
	void meth(int x)
	{
		System.out.println("hi");
		System.out.println("x value is : "+x);
		System.out.println(x+1);
	}
	public static void main(String[] args) {
		System.out.println("Start");
		ClassF obj=new ClassF();
		obj.meth(99);
		System.out.println("End");
	}
}
