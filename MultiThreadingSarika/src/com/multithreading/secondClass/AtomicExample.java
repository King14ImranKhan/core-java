package com.multithreading.secondClass;

import java.util.concurrent.atomic.AtomicInteger;

public class AtomicExample {
	public static void main(String[] args) {

		AtomicInteger a = new AtomicInteger(0);
		for (int i = 0; i < 10; i++) {
			new Thread(new Runnable() {

				@Override
				public void run() {
					for (int j = 0; j < 100; j++) {
						a.incrementAndGet();
					}
				}
			}).start();
		}
		try {
			Thread.sleep(1000);
		}catch(InterruptedException e) {
			e.printStackTrace();
		}
		System.out.println("result "+a.get());
	}
}
