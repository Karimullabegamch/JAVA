package regular;
public class Char {
	void meth1(char c)
	{
		if ((int)c >=65 && (int)c <=90)
			System.out.println(c+"=>is upper case character");
		else 
			System.out.println(c+"=>is lower case character");
	}
	public static void main(String[] args) {
		new Char().meth1('f');
		System.out.println("--------------");
		new Char().meth1('F');
	}
}
