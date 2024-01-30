package com.multithreading.secondClass;

import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

class Task1 implements Runnable {

	@Override
	public void run() {

		System.out.println("Task is running on thread #" + Thread.currentThread().getId());

	}
}

public class NewScheduledThreadPool {
	public static void main(String[] args) {
		// Create a ScheduledThreadPoolExecutor with a pool size of 1
		ScheduledThreadPoolExecutor executor = new ScheduledThreadPoolExecutor(1);
		
		// Schedule a task to run after a 5 seconds delay
		executor.schedule(new Task1(), 5, TimeUnit.SECONDS);
		
		// Shutdown the executor when we're done using it
		executor.shutdown();
	}
}
