package com.multithreading.secondClass;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

class MyCall implements Callable{
	
	long s = 0;

	@Override
	public Object call() throws Exception {
		for(long i=0;i<=1_000_0203_3;i++) {
			s+=i;
		}
		//System.out.println(s);
		return s;
	}

	
}
public class CallableEx {
		public static void main(String[] args) {
			java.util.concurrent.ExecutorService executor = Executors.newSingleThreadExecutor();
			// You can execute callable using an ExecutorService, which is a class that manage threads
			//that can execute asynchronously
			MyCall c = new MyCall();
			Future<Long> future = executor.submit(c);
			try {
				// Block 1 second until the Callable has finished
				long result = future.get(1,TimeUnit.SECONDS);
				System.out.println(result);
			}catch(InterruptedException | ExecutionException | TimeoutException e) {
				e.printStackTrace();
			}

		}
}
