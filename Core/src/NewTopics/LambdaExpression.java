package NewTopics;


 interface InterfaceA
 {
	 void meth1();
	 
 }
 interface InterfaceB
 {
	 
	 
	 void meth2(int a,int b);
 }
 interface InterfaceC
 {
	 
	 
	 void StringRev(String s);
 }
public class LambdaExpression  {
	
	
	public static void main(String[] args) {
		InterfaceA output=()-> System.out.println("hello world");
		
		output.meth1();
		
		InterfaceB param=(int x,int y) -> System.out.println(x+y);
		param.meth2(4,3);
		
		InterfaceC lam=(String s1)->
				{
					String stringrev="";
			for(int i=s1.length()-1;i>=0;i--)
			{
				stringrev = stringrev+s1.charAt(i);
			}
			System.out.println(stringrev);
				};
				lam.StringRev("begam");
	}

	

	
}
