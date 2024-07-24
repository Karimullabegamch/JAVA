package regular;

public class Programming {
	

	Programming()
	{
		System.out.println("i love programming");
	}
	Programming(String s)
	{
		System.out.println("i love "+""+s);
	}
	public static void main(String[] args) {
		new Programming();
		new Programming("java");
	}
}
