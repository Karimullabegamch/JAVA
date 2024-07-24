package eqls;

import java.util.Objects;

class A
{
	String nam;
	int num;
	public A(String nam, int num) {
		super();
		this.nam = nam;
		this.num = num;
	}
	@Override
	public int hashCode() {
		return Objects.hash(nam, num);
	}	
}
class B
{
String n;
int roll;
public B(String n, int roll) {
	super();
	this.n = n;
	this.roll = roll;
}
@Override
public int hashCode() {
	return Objects.hash(n, roll);
}
}
public class OverrHashCode {
	public static void main(String[] args) {
		 A aobj=new A("begam",2);
		 B bobj=new B("begam",3);
		System.out.println("aobj hashcode "+aobj.hashCode());
		System.out.println("bobj hashcode "+bobj.hashCode()); 
		 System.out.println("aboj equals bobj  "+aobj.equals(bobj));
		System.out.println("aboj equals aobj  "+aobj.equals(aobj));
		 String nam="begam";
		 String nam1="mahi";
		 System.out.println(nam.equals(nam1));
		 if(aobj.hashCode() == bobj.hashCode())
		 {
			 System.out.println("same");
			 
		 }
		 else
		 { System.out.println("difff");
			 
		 }
	}



 
}
