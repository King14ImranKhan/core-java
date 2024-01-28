package com.multithreading.firstClass;

class MT2 implements Runnable {

	@Override
	public void run() {
		for (int i = 1; i < 5; i++) {
			System.out.println("runnable child");
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
}

class MT1 extends Thread{
	public void run() {      //running
		for(int i=0;i<5;i++) {
			System.out.println("child");
			try {
				Thread.sleep(1000);  // non-runnable
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}  
	} // terminated state
}

public class MainThreadEx {
		public static void main(String[] args) {
			MT1 t1 = new MT1(); // new state
			t1.setName("thread1");
			System.out.println(t1.getName());
			//t1.run();
			t1.start();    // Runnable
			System.out.println(Thread.currentThread().getName());
			
			Runnable r = new MT2();
			Thread tt = new Thread(r);
			tt.start();
			Thread.currentThread().setName("primary");
			System.out.println(Thread.currentThread().getName());
			
			try { // It will prevent execution of main thread
				tt.join(); // tt will execute first then main 
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			for(int i=0;i<5;i++) {
				System.out.println("hello");
				try {
					Thread.sleep(1000);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		}
}
