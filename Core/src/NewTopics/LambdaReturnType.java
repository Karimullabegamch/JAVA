package NewTopics;
interface InterfaceZ
{
	String meth1(int x);
}

public class LambdaReturnType {

	public static void main(String[] args) {
		InterfaceZ lam=(x)->
		{
			if(x%2==0)
				return "even";
			else
				return "odd";
		};
		System.out.println(lam.meth1(7));
		
	}
}
