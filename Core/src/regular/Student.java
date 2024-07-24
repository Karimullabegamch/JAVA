package regular;

public class Student {
	Student()
	{
		System.out.println("unknown");
	}
	
	Student(String s)
	{
		System.out.println(s);
	}
	public static void main(String[] args) {
		new Student();
		new Student("begam");
	}
}
