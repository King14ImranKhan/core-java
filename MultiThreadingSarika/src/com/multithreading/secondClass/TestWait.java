package com.multithreading.secondClass;
// wait, notify and notifyAll == InterThreadCommunication
class Consumer{
	int amt=10000;
	synchronized void withdrw(int amt) {
		System.out.println("withdraw started");
		if(this.amt<amt) {
			System.out.println("less balance");
			try{
				wait();
			}catch(InterruptedException e) {
				e.printStackTrace();
			}
		}
		this.amt -= amt;
		System.out.println("withdraw done");
	}
	
	synchronized void deposite(int amt) {
		System.out.println("deposite started");
		this.amt += amt;
		System.out.println("deposite done");
		notify();
	}
}

class WThread extends Thread{
	Consumer c=null;
	public WThread(Consumer c) {
		this.c=c;
	}
	
	public void run() {
		c.withdrw(150000);
	}
}

class DThread extends Thread{
	Consumer c=null;
	public DThread(Consumer c) {
		this.c=c;
	}
	
	public void run() {
		c.deposite(10000);
	}
}
public class TestWait {
	public static void main(String[] args) {
		Consumer c = new Consumer();
		WThread w = new WThread(c);
		//w.setDaemon(true);
		//System.out.println(w.isDaemon());
		w.start();
		DThread d = new DThread(c);d.start();
		
		
	}

}
