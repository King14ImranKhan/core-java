package com.multithreading.basicConcept;


class MyThread extends Thread {
	public void run() {
		for (int i = 0; i <= 5; i++) {
			System.out.println("Child Thread");
		}
	}
}
public class Thread1_ {
	public static void main(String[] args) {
		MyThread obj = new MyThread();
		obj.start();
		for (int i = 0; i <= 5; i++) {
			System.out.println("Main Thread");
		}
	}
}
//start method is found in Thread class