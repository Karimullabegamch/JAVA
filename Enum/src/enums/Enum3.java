package enums;

public enum Enum3 {
	red,blue,white;
	public static void main(String[] args) {
		System.out.println(Enum3.red);
		Enum3 e=Enum3.red;
		System.out.println(e.meth1());
		System.out.println(Enum4.one);
		
	}
	Enum3()
	{
		System.out.println("con");
	}
	boolean meth1()
	{
		System.out.println(Enum3.white);
		return true;
	}
	
}
