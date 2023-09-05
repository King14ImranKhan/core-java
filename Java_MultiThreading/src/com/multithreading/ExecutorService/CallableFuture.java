package com.multithreading.ExecutorService;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
class CallableTask implements Callable<Integer> {
	@Override
	public Integer call() throws Exception {
		return 8;
	}
}
public class CallableFuture {
	public static void main(String[] args) throws InterruptedException, ExecutionException {
		ExecutorService service = Executors.newFixedThreadPool(1);
		CallableTask task = new CallableTask();
		Future<Integer> obj = service.submit(task);
		Integer i = obj.get();
		System.out.println(i);
	}
}
