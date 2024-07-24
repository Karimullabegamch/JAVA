package NewTopics;

public class VarArgs {
	//static  void meth1(int a,int ...b)
	static void meth1(String ...b)
	{
		//System.out.println(a);
		for(String val:b)
		System.out.println(val);
		
		
	}
public static void main(String[] args) {
	meth1("AA","BB","CC");
}
}
