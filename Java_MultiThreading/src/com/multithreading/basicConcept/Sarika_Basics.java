package com.multithreading.basicConcept;

public class Sarika_Basics extends Thread {
	public void run() { // running state
		for (int i = 0; i <= 5; i++) {
			System.out.println("help");
			System.out.println(i);
			try {
				Thread.sleep(1000);//1000 millisecond equals 1 second
				//sleep() sends thread from running state to non-runnable state 
				//when sleep() or wait() get called then thread goes to the runnable state not
				// in running state
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}// after completion of run() thread is in dead state called terminated state
		// it is not mandatory to override run() method from Thread class

	public static void main(String[] args) { // jvm created thread
		System.out.println(Thread.currentThread().getName());
		Thread.currentThread().setName("primary thread");
		System.out.println(Thread.currentThread().getName());

		Sarika_Basics t1 = new Sarika_Basics(); // new user thread and its in new state
		// we can call run() method directly but to make sure its an thread we should
		// call
		// start() method because run() method will be called internally from start()
		System.out.println(t1.getName());// JVM will provide name to user defined thread
		t1.start();// ready to call run() method // runnable state
		// t1.run(); -> Normal method call (No compilation error)
		//run() will not generate stack because its normal method call so to generate stack
		//we should call start()
		//Note : We can not restart a thread

	}
}
