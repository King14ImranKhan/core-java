package com.multithreading.Wait.Notify.Join.Yield;

class Calculation {
	int amt = 10000;

	synchronized void withdraw(int amt) {
		System.out.println("withraw started");
		{
			if(this.amt<amt) {
				System.out.println("less balance");
				try {
					wait();
				}catch(InterruptedException e) {
					e.printStackTrace();
				}
			}
			this.amt-=amt;
			System.out.println("withdrawn done.");
		}
	}
	synchronized void deposite(int amt) {
		System.out.println("deposite started");
		this.amt+=amt;
		System.out.println("deposite done");
		notify();
	}
}

class WThread extends Thread{
	Calculation c=null;
	public WThread(Calculation c) {
		this.c=c;
	}
	public void run() {
		c.withdraw(15000);
	}
}
class DThread extends Thread{
	Calculation c=null;
	public DThread(Calculation c) {
		this.c=c;
	}
	public void run() {
		c.deposite(15000);
	}
}

public class WaitNotify{
	public static void main(String[] args) {
		Calculation c = new Calculation();
		WThread w = new WThread(c);
		w.start();
		DThread d = new DThread(c);
		d.start();
	}
}
