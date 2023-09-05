package com.multithreading.ExecutorService;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

class Service implements Callable<String>{
	int i;
	public Service(int i) {
		this.i=i;
	}
	@Override
	public String call() throws Exception {
		Thread.sleep(1000);
		System.out.println("in thread : "+i);
		return "from thread "+i;
	}
	
}
public class ExecutorUtility {
	public static void main(String[] args) throws InterruptedException, ExecutionException {
		ExecutorService es = Executors.newFixedThreadPool(2);
		System.out.println(new Date());
		List<Callable<String>> callableList = new ArrayList<>();
		callableList.add(new Service(1));
		callableList.add(new Service(2));
		callableList.add(new Service(3));
		callableList.add(new Service(4));
		callableList.add(new Service(5));
		List<Future<String>> futureList = es.invokeAll(callableList);
		System.out.println("==========");
		for(Future<String> fu :futureList) 
			System.out.println(fu.get());
			System.out.println(new Date());
	}
}
