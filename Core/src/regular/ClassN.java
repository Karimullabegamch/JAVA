package regular;
import java.util.Scanner;
public class ClassN {
	 
	public static void main(String[] args) {
		ClassO Oobj=new ClassO();
		Scanner sc=new Scanner(System.in);
		System.out.println("enter name: ");
		Oobj.setEname(sc.next());
		System.out.println("enter sal: ");
		Oobj.setSal(sc.nextFloat());
		System.out.println("enter exp: ");
		Oobj.setExp(sc.nextInt());
		System.out.println("name: "+Oobj.getEname());
		System.out.println("sal: "+Oobj.getSal());
		System.out.println("exp: "+Oobj.getExp()+"years");
		Oobj.meth1();
		sc.close();
		
		}

	    



}
