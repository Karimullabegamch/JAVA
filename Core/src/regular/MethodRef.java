package regular;

public class MethodRef {
	void methodRef()
	{
		InterfaceA obj=new MethRef():: meth;
//	InterfaceA obj1= MethRef:: meth1;
		InterfaceA obj1=MethRef::new;
		obj.meth1();
		obj1.meth1();
	
	}
	
	public static void main(String[] args) {
		new MethodRef().methodRef();
	}

}

