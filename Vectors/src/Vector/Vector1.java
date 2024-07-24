package Vector;

import java.util.Vector;

public class Vector1 {

	public static void main(String[] args) {
		Vector v = new Vector();
		System.out.println("v size ==="+v.size());
		System.out.println("v capacity =="+v.capacity());
		v.add(2);
		v.add(3);
		v.addElement("begam");
		System.out.println(v);
		System.out.println("v size ==="+v.size());
		System.out.println("v capacity =="+v.capacity());
		
		System.out.println("====");
		Vector v1=new Vector(4);// intial capacity is 2, and if it is 3rd one inserted then it becomes 2+2=4(doubled)
		System.out.println("v1 size ==="+v1.size());
		System.out.println("v1 capacity =="+v1.capacity());
		v1.add(8);
		v1.insertElementAt(3, 0);
		v1.addElement(100);
		v1.addElement(100);
		v1.addElement(100);
		System.out.println(v1);
		System.out.println("v1 size ==="+v1.size());
		System.out.println("v1 capacity =="+v1.capacity());
		System.out.println("====");
		Vector v2=new Vector(2,6);// intial capacity is 2, and if it is 3rd one inserted then it becomes 2*2=4
		System.out.println("v2 size ==="+v2.size());
		System.out.println("v2 capacity =="+v2.capacity());
		v2.add(8);
		v2.insertElementAt(3, 0);
		System.out.println("v2 capacity =="+v2.capacity());
		v2.addElement(100);
		System.out.println(v1);
		System.out.println("v2 size ==="+v2.size());
		System.out.println("v2 capacity =="+v2.capacity());
		
		System.out.println("====");
		System.out.println("v1"+v1+"v2"+v2);
		System.out.println(v1.remove(2));
		System.out.println("v1"+v1);
		v1.remove(v2);	
		Vector<String> v3=new Vector<String>();
		//v3.add(2);=== error
		v3.add("2");
		
	}
	
	
	
}
