package demosession;

public class ClassI 
{
	void meth(int a,int b)
	{
		System.out.println(a);
		System.out.println( b);
		
	}
	public static void main(String[] args) {
		System.out.println("start");
		ClassI obj=new ClassI();
		obj.meth(20,30);
		System.out.println("end");
	}
}
