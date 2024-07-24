package NewTopics;

public class DeamonThread  extends Thread{
	
	void meth1()
	{
		if(Thread.currentThread().isDaemon())
		{
			System.out.println("daemon thread");
		}
		else
		{
			System.out.println("not a daemon thread");
		}
	}
public static void main(String[] args)  {
	
	System.out.println(Thread.currentThread().getName());//main
	System.out.println(Thread.currentThread().isDaemon());//false
	
	DeamonThread obj1=new DeamonThread();
	DeamonThread obj2=new DeamonThread();
	DeamonThread obj3=new DeamonThread();
	
	obj2.setDaemon(true);
	
	obj1.meth1();// not a daemon thread
	obj2.meth1();// daemon thread
	obj3.meth1();// not a daemon thread
	
	
	
	
	
	
}
}
