package com.multithreading.basicConcept;


public class RunnableMethod2 {
	public static void main(String[] args) {
		Runnable obj = new Runnable() {
			@Override
			public void run() {
				for (int i = 0; i <= 10; i++) {
					System.out.println(i);
				}
			}
		};
		Thread thread = new Thread(obj);
		thread.start();
	}
}
