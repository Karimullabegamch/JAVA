package demosession;

public class ClassE 
{
	void add()
	{
		System.out.println(10+20);
	}
	void sub()
	{
		System.out.println(20-10);
	}
	void mul()
	{
		System.out.println(10*20);
	}
	void div()
	{
		System.out.println(20/5);
	}
	public static void main(String[] args) {
		System.out.println("Start");
		ClassE obj =new ClassE();
		obj.add();
		obj.sub();
		obj.mul();
		obj.div();
		System.out.println("End");
	}
}
