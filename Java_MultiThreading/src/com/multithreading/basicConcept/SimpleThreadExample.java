package com.multithreading.basicConcept;

class Simple extends Thread{
	public void run() {
		System.out.println("Hello");
	}
}
public class SimpleThreadExample {
	public static void main(String[] args) {
		
		Simple simple = new Simple();
	
	simple.start();
	}

}
