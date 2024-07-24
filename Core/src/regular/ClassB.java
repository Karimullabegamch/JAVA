package regular;

public class ClassB 
{
	static
	{
		int i=10;
		Integer ival=i;
		System.out.println("int pdt " +i);
		System.out.println("wco "+ival);
		System.out.println();
		
		byte b=34;
		Byte bval=b;
		System.out.println("byte pdt "+b);
		System.out.println("wco "+bval);
		System.out.println();
		
		short s=23;
		Short sval=s;
		System.out.println("short pdt "+s);
		System.out.println("wco "+sval);
		System.out.println();
		
		long l=353;
		Long lval=l;
		System.out.println("long pdt "+l);
		System.out.println("wco "+lval);
		System.out.println();
		
		char c='a';
		Character cval=c;
		System.out.println("char pdt "+c);
		System.out.println("wco "+cval);
		System.out.println();
		char c1=65;
		//char c1="begma";
		Character cval1=c;
		System.out.println("char pdt "+c1);
		System.out.println("wco "+cval1);
		System.out.println();
		float f=3.4f;
		Float fval=f;
		System.out.println("float pdt "+f);
		System.out.println("wco "+fval);
		System.out.println();
		double d=2342.2;
		Double dval=d;
		System.out.println("double pdt "+d);
		System.out.println("wco "+dval);
		System.out.println();
		boolean b1=true;
		Boolean bval1=b1;
		System.out.println("boolean pdt "+b1);
		System.out.println("wco "+bval1);
		System.out.println();
	}
	static
	{ 
		System.out.println("unboxing");
		Integer i=new Integer("2");
		//Integer i="abc";-->error we have to give new Integer("abc")
		int ival=i;
		System.out.println(" int wco "+i);
		System.out.println(" int pdt "+ival);
		System.out.println();
		
		Byte b=23;
		Byte bv=new Byte("12");//-->errror
		byte bval=b;
		System.out.println("byte wco "+b);
		System.out.println("byte pdt "+bval);
		System.out.println();
		
		Short s=34;
		short sval=s;
		System.out.println("short wco "+s);
		System.out.println("short pdt "+sval);
		System.out.println();
		
		Character c='v';
		char cval=c;
		System.out.println(" char wco "+c);
		System.out.println(" char pdt "+cval);
		System.out.println();
		
//		Character cval1=new Character("begam");
//		char cval2=cval1;
//		System.out.println(" char wco "+c);
//		System.out.println(" char pdt "+cval);
//		System.out.println();
		
		Float f=23.3f;
		//Float f="begam";
		//Float f=new Float("2beg35am");//--> exception
		float fval=f;
		System.out.println("float pdt "+f);
		System.out.println("wco "+fval);
		System.out.println();
		
		Double d=343.9;
		//Double d1="begam";
		Double d1=new Double("begam");
		double dval=d;
		System.out.println("double pdt "+d);
		System.out.println("wco "+dval);
		System.out.println();
	}
	public static void main(String[] args) {
		System.out.println("hello");
		return ;
	}
	
}
