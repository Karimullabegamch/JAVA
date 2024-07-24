package NewTopics;
class Cls
{
	String name;
	int age;
	public Cls()
	{
		this.name="begam";
		this.age=14;
		}
	public Cls(Cls obj)
	{
		this.name=obj.name;
		this.age=obj.age;
		System.out.println(this.name);
		System.out.println(this.age);
	}
}
public class CopyConstr {
public static void main(String[] args) {
	Cls obj=new Cls();
	Cls obj1=new Cls(obj);
	
}
}
