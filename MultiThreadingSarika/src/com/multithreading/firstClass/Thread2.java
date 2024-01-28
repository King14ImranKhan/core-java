package com.multithreading.firstClass;

// sleep method will put our thread from runnable state to non-runnable state for some specific time
// when  time is over then again thread will be back in runnable state.
class MyThread2 implements Runnable {

	public void print() {
		for (int i = 65; i <= 75; i++) {
			System.out.println((char) i);
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}

	@Override
	public void run() {
		print();
	}
}

public class Thread2{
	public static void main(String[] args) {
		// Thread.currentThread.setName("primary thread");
		// System.out.print(Thread.currentThread().getName());
		MyThread2 t2 = new MyThread2();
		Thread t = new Thread(t2);
		t.setName("child1");
		
		MyThread2 t3 = new MyThread2();
		Thread t1 = new Thread(t3);
		t1.setName("child2");
		t.start();
		System.out.println(t.isAlive());
		t1.start();
	}
}
