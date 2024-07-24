package com.nit.Thr4ead;

public class ImplRunnableAndJoinMeth implements Runnable {
	
public void run()
{
	System.out.println("run method "+Thread.currentThread().getName());
	
}
public static void main(String[] args) throws InterruptedException  {
	Thread t=new Thread();
	t.start();
	
	ImplRunnableAndJoinMeth obj=new ImplRunnableAndJoinMeth();
	obj.run();
	Thread t1=new Thread(obj);
	t1.start();
	t1.join();// 
	obj.run();
	
//	Runnable r=new Runnable() {
//
//		@Override
//		public void run() {
//			// TODO Auto-generated method stub
//			System.out.println("anonymous runnable ");
//		}
//		};
//		Thread r1=new Thread(r);
//		r1.start();
	
	
// so we can write like this every time boilareplate is coming so
// we can implement lambda function for runnable interface only
// beacause lambda will work for only functional interace
	Runnable r=() ->{
			System.out.println("anonymous runnable ");
		
		};
		Thread r1=new Thread(r);
		r1.start();
	
}
}

// t1.join() 
// means it stops thread what is running now
// and allows to run t1 thread
// after completion of t1 thread it will resume that stoped thread