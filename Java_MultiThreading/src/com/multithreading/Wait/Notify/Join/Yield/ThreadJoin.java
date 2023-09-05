package com.multithreading.Wait.Notify.Join.Yield;

class MyThread1 extends Thread {
	public void run() {
		for (int i = 0; i < 5; i++) {
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			System.out.println("Hello " + Thread.currentThread().getName());
		}
	}
}

public class ThreadJoin {
	public static void main(String[] args) {
		Thread.currentThread().setName("Primary thread");
		MyThread1 t1 = new MyThread1();
		t1.start();
		/*try {
			t1.join();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}*/
		//In Multithreading Main method thread will complete first, but sometime we don't want
		// main thread to complete first 
		for (int i = 0; i < 5; i++) {
			System.out.println("Main thread " + i);
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {

			}
		}
	}
}