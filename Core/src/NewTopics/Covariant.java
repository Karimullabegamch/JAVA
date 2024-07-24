package NewTopics;

class A1
{
    A1 meth1()
    {
        System.out.println("A classs");
        return this;
    }
}
class B1 extends A1{
    B1 meth1()
    {
       
        System.out.println("B classs");
         return this;
    }
   
}
public class Covariant {
	 public static void main(String[] args) {
	       A1 obj=new B1();
	       System.out.println(obj.meth1());
	       A1 obj1 =new A1();
	         System.out.println(obj1.meth1());
	         
	           B1 objB=new B1();
	       System.out.println(objB.meth1());
	       
	       
	    }

}
