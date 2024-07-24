package regular;
import java.util.Scanner;
public class ClassE {
	static Scanner sc= new Scanner(System.in);
	String meth1(String sname,int sid,String course)
	{
		System.out.println("enter addres");
		sc.nextLine();
		return  "address: "+sc.nextLine();
	}
	public static void main(String[] args) {
		ClassE eobj=new ClassE();
		System.out.println("enter name");
		String sname=sc.next();
		System.out.println("enter roll no");
		int sid=sc.nextInt();
		System.out.println("enter course name ");
		String course=sc.next();
		String addr=eobj.meth1(sname,sid,course);
		System.out.println("name :" +sname );
		System.out.println("roll no:" +sid);
		System.out.println("course: "+course);
		System.out.println(addr);
	}
}