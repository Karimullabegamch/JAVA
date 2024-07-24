package prepinst;

public class HcfLcm {
	static private int temp;
	public static void meth1(int a,int b)
	{
		for(int i=1;i<a && i<b;i++)
		{
			if(a%i==0 && b%i ==0)
				temp=temp+1;
			
		}
		System.out.println("hcf = "+temp);
		System.out.println("lcm ="+ (a*b)/temp);
		
	}
	public static void main(String args[])
	{
		meth1(6,18);
	}
}
