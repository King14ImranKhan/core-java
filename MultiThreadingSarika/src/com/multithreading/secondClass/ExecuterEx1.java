package com.multithreading.secondClass;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

class MyR2 implements Runnable{

	@Override
	public void run() {
		for(int i=0;i<5;i++) {
			try {
				Thread.sleep(1000);
			}catch(InterruptedException e) {
				e.printStackTrace();
			}
			System.out.println("Thread name "+" "+i);
		}
	}
	
}
public class ExecuterEx1 {
	
	public static <ExecutorService> void main(String[] args) {
		java.util.concurrent.ExecutorService executor = Executors.newSingleThreadExecutor();
		MyR2 r = new MyR2();
		Future<?> future = executor.submit(r); // return type of submit() method is Future.
		try {
			// Blocks until the Runnable has finished.
			future.get();
		}catch(InterruptedException | ExecutionException e) {
			System.out.println(e);
		}
	}

}
// Future class has 3 methods - 1.get() /  2.get(long timeout,TimeUnit unit)  /  3. boolean isCancelled()  
