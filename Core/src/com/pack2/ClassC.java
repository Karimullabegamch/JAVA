package com.pack2;
import java.util.Vector;
import java.util.Enumeration;
public class ClassC 

{
   void meth3()
  {
	 Vector<ClassD> v=new Vector<ClassD>();
	 ClassD dobj1=new ClassD(1,2,3);
	 ClassD dobj2=new ClassD(4,5,6);
	 ClassD dobj3=new ClassD(7,8,9);
	 v.add(dobj1);
	 v.add(dobj2);
	 v.add(dobj3);
	 System.out.println(v);
	// for(Object o:v)
		// System.out.println(o);
	Enumeration<ClassD>e= v.elements();
	while(e.hasMoreElements())
		System.out.println(e.nextElement());
	
	 
	 
	 
  }
   public static void main(String[] args) {
	ClassC obj=new ClassC();
	obj.meth3();
}
  

}


