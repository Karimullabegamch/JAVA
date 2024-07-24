package com.nit.Thr4ead;

public class MovieTickets {
	int totalTick=200;
	int availableSeats=0;
	
	public synchronized void booking(int tic) throws InterruptedException
	{
		for(int i=1;i<=tic;i++)
		{
			if(availableSeats<=totalTick)
			{Thread.sleep(10);
				
				System.out.println(i);
				availableSeats++;
			}
			
			
		}
		System.out.println("reamaing seats are " +(totalTick-availableSeats));
	}
	public static void main(String[] args) throws InterruptedException {
		
		MovieTickets mv=new MovieTickets();
		
		//mv.booking(10);
		//mv.booking(10);
		Thread t1=new Thread() {
			public void run()
			{
			//	mv.booking(20);
//				try {
//					Thread.sleep(10);
//				} catch (InterruptedException e) {
//					// TODO Auto-generated catch block
//					e.printStackTrace();
//				}
			}
		};
		Thread t2=new Thread() {
			public void run()
			{
				//smv.booking(10);
			}
		};
		t1.start();
		
		t2.start();
	}

}
