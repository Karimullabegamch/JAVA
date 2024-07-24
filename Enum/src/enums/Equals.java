package enums;

public class Equals {
 enum Colors{
	 red,blue,yellow
 }
 public static void main(String[] args) {
	Colors c1=Colors.blue;
	Colors c2=Colors.blue;
	if(c1==c2) {
		System.out.println("==");
	}
	if(c1.equals(c2))
	{
		System.out.println("equals");
	}
	
}
}
