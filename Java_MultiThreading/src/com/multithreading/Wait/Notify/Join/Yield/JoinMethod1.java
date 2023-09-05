package com.multithreading.Wait.Notify.Join.Yield;


class MyClass2 implements Runnable {

	@Override
	public void run() {
		Thread t = Thread.currentThread();
		System.out.println("Thread started: " + t.getName());
		try {
			Thread.sleep(4000);
		} catch (InterruptedException ie) {
			ie.printStackTrace();
		}
		System.out.println("Thread ended: " + t.getName());
	}
}

public class JoinMethod1 {
	public static void main(String[] args) throws InterruptedException {
		Thread th1 = new Thread(new MyClass2(), "th1");
		Thread th2 = new Thread(new MyClass2(), "th2");
		Thread th3 = new Thread(new MyClass2(), "th3");

		th1.start();
		th1.join();
		th2.start();
		th2.join();
		th3.start();
	}
}
