package com.multithreading.ExecutorService;

import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

public class ExecutorService1 {
	public static void main(String[] args) {
		java.util.concurrent.ExecutorService executorService = Executors.newFixedThreadPool(2); 
		Runnable task1 = new Runnable() {
			@Override
			public void run() {
				System.out.println(Thread.currentThread().getName());
				System.out.println("My Task1 starts");
				try {
					TimeUnit.SECONDS.sleep(2);
				}catch(InterruptedException ex) {
					ex.printStackTrace();
				}
				System.out.println("My Task1 end..");
			}
		};
		
		Runnable task2 = new Runnable() {
			@Override
			public void  run() {
				System.out.println(Thread.currentThread().getName());
				System.out.println("My Task2 starts");
				try {
					TimeUnit.SECONDS.sleep(2);
				}catch(InterruptedException ex) {
					ex.printStackTrace();
				}
				System.out.println("My Task2 end..");
			}
		};
		
		Runnable task3 = new Runnable() {
			@Override
			public void  run() {
				
				System.out.println(Thread.currentThread().getName());
				System.out.println("My Task3 starts");
				try {
					TimeUnit.SECONDS.sleep(2);
				}catch(InterruptedException ex) {
					ex.printStackTrace();
				}
				System.out.println("My Task3 end..");
			}
			
		};
		executorService.submit(task1);
		executorService.submit(task2);
		executorService.submit(task3);
		executorService.shutdown();
	}
}
