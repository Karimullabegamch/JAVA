package NewTopics;
class A
{
    int meth1()
    {
        System.out.println("A classs");
        return 5;
    }
}
class B extends A{
	@Override
    int meth1()
    {
       
        System.out.println("B classs");
         return 44;
    }
}
public class MethodOverriding {
	public static void main(String[] args) {
	       A obj=new B();// overriding
	       System.out.println(obj.meth1());
	       A obj1 =new A(); // only calls parent methods
	         System.out.println(obj1.meth1());
	         
	           B objB=new B();
	       System.out.println(objB.meth1());
}
}