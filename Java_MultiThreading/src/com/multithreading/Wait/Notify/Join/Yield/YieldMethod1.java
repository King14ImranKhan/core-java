package com.multithreading.Wait.Notify.Join.Yield;


class Yield implements Runnable{

	@Override
	public void run() {
		for(int i=0;i<=5;i++) {
			System.out.println("Child Thread");
			Thread.yield();
			try {
				Thread.sleep(500);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
}
public class YieldMethod1 {
	public static void main(String[] args) {
		Runnable runnable = new Yield();
		Thread thread = new Thread(runnable);
		thread.start();
		for(int j=11;j<=15;j++) {
			System.out.println("Main Thread");
			Thread.yield();
		}
	}
}
