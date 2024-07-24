package eqls;

public class Compar {
	public static void main(String[] args) {
		Employee e=new Employee(6,"gayi");
		
		
		Employee e1=new Employee(101,"gayi");
		Product p=new Product(6,"gayi");
		
		System.out.println("e hashcode "+e.hashCode());
		System.out.println("e1 hashcode "+e1.hashCode());
		System.out.println("p hashcode "+p.hashCode());
		
		System.out.println("e.equals of (p) "+e.equals(p));
		System.out.println("e.equals of (e1) "+e.equals(e1));
		
		if(e.hashCode()== p.hashCode()) {
			 System.out.println("same");
		}
		else {
			 System.out.println("diff");
		}
		
	}

}
