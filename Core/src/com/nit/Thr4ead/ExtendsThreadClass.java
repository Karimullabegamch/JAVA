package com.nit.Thr4ead;

public class ExtendsThreadClass extends Thread {

	public void run()
	{
		System.out.println("thread runnig");
	}
	
	
	public static void main(String[] args) {
		Thread t3=new Thread()
		{
	@Override
	public void run()
	{
		System.out.println("anonymus thread "+Thread.currentThread().getName());
	}
	};
		
		ExtendsThreadClass obj=new ExtendsThreadClass();
		obj.run();
		Thread t=new Thread();//here no argument, so current class run method will execute, so thread is current class
		t.start();// it is go to thread class run method so no output
		
		Thread t1=new Thread(obj);// this class argument soo, this class run method will execute
		t1.start();				
		t3.start();
		
		
	}
}
