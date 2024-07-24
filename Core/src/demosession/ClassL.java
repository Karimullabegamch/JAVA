package demosession;

public class ClassL 
{
	int meth()
	{
		System.out.println("hi");
		return 1;
	}
	public static void main(String[] args) {
		ClassL obj=new ClassL();
		System.out.println(obj.meth());
		System.out.println(obj.meth()+99);
	}

}
