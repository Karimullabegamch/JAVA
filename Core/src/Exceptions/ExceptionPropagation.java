package Exceptions;

public class ExceptionPropagation{
 static void meth1() 
 {
	 
	//  throw new ClassNotFoundException();
  }
	
 static void meth2()
 {  
	 meth1();
	  System.out.println("meth1");
 }
	
 static void meth3()
 {
// //{  try 
// //{
//	 meth2();
//// }
// //catch(ClassNotFoundException e)
// {
//	 e.printStackTrace();
// }
	  System.out.println("meth1");
 }
	
 static void meth4()
 {  
	 meth4();
	  System.out.println("meth1");
 }
	

 
	public static void main(String[] args) {
		ExceptionPropagation obj=new ExceptionPropagation();
		obj.meth4();
		
	}
}
