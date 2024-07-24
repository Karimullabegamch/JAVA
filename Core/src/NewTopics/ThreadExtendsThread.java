package NewTopics;

public class ThreadExtendsThread extends Thread  {
	
	public void run()
	{
		System.out.println("thread is running");
	}
	public static void main(String[] args) {
		
		ThreadExtendsThread obj=new ThreadExtendsThread();
		obj.run();
		obj.start();
		Thread t=new Thread(obj);
		t.start();
	}

}
