package NewTopics;

public class ThreadIsAlive extends Thread{
	public void run()
	{
		System.out.println("run method");
		//System.out.println(t.isAlive());
	}
	

	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		 
		ThreadIsAlive t=new ThreadIsAlive();
		Thread t1=new Thread(t);
		t.start();
		System.out.println(t.isAlive());
		System.out.println("t1===>"+t1.isAlive());
		
		
		
		

	}

}
