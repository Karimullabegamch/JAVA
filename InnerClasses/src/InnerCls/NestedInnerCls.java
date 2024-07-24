package InnerCls;

public class NestedInnerCls {
	public void meth1()
	{
		System.out.println("outer cls");
	}
	
	class NestCls{
		public void meth1()
		{
			System.out.println("inner cls");
		}
	}
	public static void main(String[] args) {
		NestedInnerCls obj=new NestedInnerCls();
		obj.meth1();
		NestedInnerCls.	NestCls obj1=new NestedInnerCls().new NestCls();
		obj1.meth1();
		
	}

}
