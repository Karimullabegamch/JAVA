package regular;

public class ClaasA 
{
	int c;
	static int e;
	ClaasA()
	{
		System.out.println(++c);
		System.out.println(++e);
	}
	public static void main(String[] args) {
		int a=34;
		int b=21;
		new ClaasA().c-=a++ + ++b;
		int d= --a + --b + new ClaasA().c--;
		e=a + +b + +new ClaasA().c +d--;
		int f =-a + b-- + -new ClaasA().c - d++;
		int sum= a+b+new ClaasA().c+d+e+f;
		System.out.println("sum= "+sum);
	}
}
