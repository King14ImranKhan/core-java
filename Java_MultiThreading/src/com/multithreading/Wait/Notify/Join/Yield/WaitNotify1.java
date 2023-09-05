package com.multithreading.Wait.Notify.Join.Yield;


class TotalEarning extends Thread {
	int totalweight = 0;

	public void run() {
		synchronized (this) {
			for (int i = 1; i <= 10; i++) {
				totalweight = totalweight + i;
			}
			notify();
		}
	}
}

public class WaitNotify1 {
	public static void main(String[] args) throws InterruptedException {
		TotalEarning obj = new TotalEarning();
		obj.start();
		synchronized(obj) {
			obj.wait();
			System.out.println("Total Weight = "+obj.totalweight);
		}
	}

}
