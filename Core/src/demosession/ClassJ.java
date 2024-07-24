package demosession;

public class ClassJ 
{
	int meth()
	{
		System.out.println("hii");
		return 4;
	}
	public static void main(String[] args) {
		System.out.println("java is awesome");
		ClassJ obj=new ClassJ();
		int x=obj.meth();
		System.out.println("meth is returniniig "+x);
		System.out.println(x+1);
	}

}
