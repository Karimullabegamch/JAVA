package com.nit.Thr4ead;

class MyThread1 extends Thread {
	public void run() {
		for (int i = 80; i <= 100; i++) {
			System.out.println(i);
		}
	}
}

public class Test {
	public static void main(String[] args) throws InterruptedException {
		Runnable r = () -> {
			for (int i = 0; i <= 10; i++) {
				try {
					Thread.sleep(1000);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				System.out.println(Thread.currentThread().getName()+" : "+i);
			}

		};
		Thread th2 = new Thread() {
			public void run() {
				for (int i = 0; i <= 10; i++) {
					System.out.println(Thread.currentThread().getName()+" : "+i);
				}
			}
		};
		Thread th1 = new Thread(r);
		th1.start();
		th1.join();
		th2.start();

	}
}
