package regular;

public class Increment {
	void meth1()
	{
		int x=10;
		int y=x++;
		int z=y++ + ++x+10;
		int res=x++ + ++y +z+++50;
		System.out.println(res++);
		System.out.println(res++);
		System.out.println(res++);
		System.out.println(res+x+++y+z+++(++res));
		System.out.println("x :"+x);
		System.out.println("y :"+y);
		System.out.println("z : "+z);
		
	}
public static void main(String[] args) {
	new Increment().meth1();
}
}
