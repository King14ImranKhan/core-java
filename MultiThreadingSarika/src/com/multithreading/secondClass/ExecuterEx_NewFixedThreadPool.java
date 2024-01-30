package com.multithreading.secondClass;

import java.util.concurrent.Executors;

class Task implements Runnable {

	private int taskId;

	public Task(int taskId) {
		this.taskId = taskId;
	}

	@Override
	public void run() {
		System.out.println("Task #" + taskId + "is running on thread #");
		Thread.currentThread().getId();
	}
}

public class ExecuterEx_NewFixedThreadPool {
	public static void main(String[] args) {
		// Create an ExecutorService with a thread pool of 5 worker thread
		java.util.concurrent.ExecutorService executor = Executors.newFixedThreadPool(5);
		//Submit tasks to the ExecutorService for execution
		for(int i=0;i<10;i++) {
			Runnable task = new Task(i);
			executor.execute(task);
		}
		executor.shutdown();

	}

}
