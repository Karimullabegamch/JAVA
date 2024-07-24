package regular;

public class Lambda {
	

	void meth1()
	{
		InterfaceA obj=()-> 
		{
			System.out.println("hello ");
			
		};
		obj.meth1();
		
		
	}
	public static void main(String[] args) {
		new Lambda().meth1();
	}
}
