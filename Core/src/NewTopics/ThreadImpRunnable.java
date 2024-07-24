package NewTopics;

public class ThreadImpRunnable implements Runnable  {
	@Override
	public void run()
	{
		System.out.println("thread is running");
	}
	public static void main(String[] args) {
		
		ThreadImpRunnable obj=new ThreadImpRunnable();
		
		Thread t=new Thread();
		obj.run();
		t.start();// no output
		
		Thread t1=new Thread(obj);
		t1.start();
	}

}
