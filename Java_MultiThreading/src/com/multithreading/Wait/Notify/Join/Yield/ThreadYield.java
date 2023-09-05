package com.multithreading.Wait.Notify.Join.Yield;

class MyThread implements Runnable {

	@Override
	public void run() {
		for (int i = 0; i < 10; i++) {
			String threadName = Thread.currentThread().getName();
			System.out.println(threadName + "\t" + "i = " + i);
			if("T1".equalsIgnoreCase(threadName)) {
				Thread.yield();
			}
		}
	}
}

public class ThreadYield {
	public static void main(String[] args) {
		MyThread r = new MyThread();
		Thread t1 = new Thread(r, "T1");
		Thread t2 = new Thread(r, "T2");
		t1.start();
		t2.start();

	}
}
