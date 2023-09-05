package com.multithreading.Wait.Notify.Join.Yield;


class ThreadB extends Thread {
	int total;
	@Override
	public void run() {
		synchronized (this) {
			for (int i = 0; i < 10; i++) {
				System.out.println(i);
				total =total+ i;
			}
			notify();
			System.out.println("Hello notify");

		}
	}
}

public class WaitNotify2 {
	public static void main(String[] args) {
		ThreadB b = new ThreadB();
		b.start();
		synchronized (b) {
			try {
				System.out.println("Waiting for b to complete...");
				b.wait();
			} catch (InterruptedException e) {
				e.printStackTrace();
			}

			System.out.println("Total is: " + b.total);
		}
	}
}