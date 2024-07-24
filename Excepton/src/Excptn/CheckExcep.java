package Excptn;

public class CheckExcep {
public static void main(String[] args) throws InterruptedException {
	System.out.println("main started ");
	Thread t=new Thread() {
		public void run()
		{
			System.out.println("thread");
		}
	};
	t.start();
	t.join();
//	try {
//		t.start();
//	//t.join();
//	}
//	catch(Exception e)
//	{
//		System.out.println("catch ");
//	}
//	
}
}
