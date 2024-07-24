package regular;

public class ClassD {
	String meth1(int a,int b,int c,int d)
	{
		if (a<=10)
		{
			System.out.println("hii");
			if((a+b)==50)
				return "hi";
			return "hello";
				}
		else
		{
			if(c>=a)
			{
				if(true)
					return "tuesday";
				return "wednesday";
			}
			else
			{
				if(d>0)
					System.out.println(d+"is +ve");
				else if(d<0)
					System.out.println(d+"is -ve");
				else
					System.out.println(d+"is equal to zero");
				return "java is awesome";
			}
		}
	}
	public static void main(String[] args) {
		ClassD dobj=new ClassD();
		String res=dobj.meth1(50,40,50,60);
		System.out.println("meth1 returning =>"+res);
	}
}
