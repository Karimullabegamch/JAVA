package com.nit.Thr4ead;

public class SleepMeth implements Runnable {
	public void run()
	{
		for(int i=0;i<10;i++)//0,0,1
		{
			System.out.println(i +" "+Thread.currentThread().getName());//0-0/,1-0,,0-1
//			try {
//			Thread.sleep(500);//
//			}
//			catch(Exception e)
//			{
//				e.printStackTrace();
//			}
			
		}
	}

	public static void main(String[] args) throws InterruptedException  {
		
		System.out.println("main-1");
		Thread t=new Thread(new SleepMeth());
		Thread t1=new Thread(new SleepMeth());
		t.start();
		t.join();
		t1.start();
		t1.join();
		Thread t2=new Thread(new SleepMeth());
		t2.start();
		
		System.out.println("main");
	}
}
