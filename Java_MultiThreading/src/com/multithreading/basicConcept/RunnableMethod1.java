package com.multithreading.basicConcept;


class Interf implements Runnable {

	@Override
	public void run() {
		for (int i = 0; i <= 10; i++) {
			System.out.println(i);
		}
	}
}

public class RunnableMethod1 {
	public static void main(String[] args) {
		Runnable obj = new Interf();
		Thread thread = new Thread(obj);
		thread.start();
	}

}
