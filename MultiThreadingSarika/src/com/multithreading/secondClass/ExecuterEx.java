package com.multithreading.secondClass;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

class MyR1 implements Runnable{

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

public class ExecuterEx {
	public static void main(String[] args) {
		ExecutorService e1 = Executors.newSingleThreadExecutor();
		MyR1 runnable = new MyR1();
		
		//Thread t = new Thread(runnable); -> We are not doing like this here 
		//t.start();
		System.out.println("before execution");
		e1.execute(runnable); // we are doing like this
		System.out.println("after execution");
		e1.shutdown(); // It means it will stop accepting new requests but allow running threads to complete first.
		e1.shutdownNow();// It means stop accepting new requests and do not allow running thread to run more.
	}

}
