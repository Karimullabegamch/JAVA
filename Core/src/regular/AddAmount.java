package regular;

public class AddAmount {
	static int amount=500;
	AddAmount()
	{
		System.out.println("intial amount"+" " +amount);
		
	}
	AddAmount(int a)
	{
		amount=amount+a;
		System.out.println("after adding amount"+" "+amount);
	}
public static void main(String[] args) {
	new AddAmount();
	new AddAmount(2000);
}
}
