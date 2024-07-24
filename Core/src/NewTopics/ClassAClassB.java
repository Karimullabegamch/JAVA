package NewTopics;

class Class {

	int a=9990;
	private int b=1000;
	private String na="begam11";
	
	
	@Override
	public String toString() {
		return "Class [a=" + a + ", b=" + b + ", na=" + na + "]";
	}
	public String getNa() {
		return na;
	}
	public void setNam(String na) {
		this.na = na;
	}
	public int getB() {
		return b;
	}
	public void setB(int b) {
		this.b = b;
	}
	
	
	
}

public class ClassAClassB {
	public static void main(String[] args) {
		System.out.println(new Class().a);
		System.out.println(new Class().getB());
		System.out.println(new Class().getNa());
		System.out.println(new Class());

	}
}
