package enums;

public class Enum2 {
  enum Color{
	  red,blue
  }
  public void meth1()
  {
	  enum Weeks
	  {
		  sun,sat
	  }
	  System.out.println(Weeks.sat);
  }
  Enum2()
  {
	  enum Season{
		  spring,atumn
	  }
	  System.out.println(Season.spring);
  }
  public static void main(String[] args) {
	new Enum2().meth1();
	System.out.println(Color.red);
}
}
