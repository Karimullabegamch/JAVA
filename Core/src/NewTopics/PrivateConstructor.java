package NewTopics;

public class PrivateConstructor {

	 int a;
	 
	 private PrivateConstructor(int a)
	 {
		 this.a=a;
		 
	 }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		PrivateConstructor obj=new PrivateConstructor(5);
		
		System.out.println(obj.a);
		
		PrivateConstructor obj1=new PrivateConstructor(7);
		System.out.println(obj1.a);

	}

}
