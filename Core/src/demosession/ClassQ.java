package demosession;

public class ClassQ 
{
	public String meth1()
	{
		System.err.println(35);
		return new ClassQ().meth3(new ClassQ().meth2())+new ClassQ().meth4("here");
		
	}
	public int meth2()
	{
		System.out.println(25);
		return 25+5;
		
	}
	public String meth3(int a)
	{
		System.out.println(15);
		return "is";
	}
	public String meth4(String s)
	{
		System.out.println(45);
		return "awesome";
		
	}
	public static void main(String[] args) {
		ClassQ t=new ClassQ();
		System.out.println("java"+t.meth1());
	}

}
