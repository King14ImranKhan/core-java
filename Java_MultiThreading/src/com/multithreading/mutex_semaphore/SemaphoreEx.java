package com.multithreading.mutex_semaphore;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Semaphore;
import java.util.concurrent.TimeUnit;

class Connections {
	private static Connections instance = new Connections();
	private Semaphore sem = new Semaphore(10);
	private int connections = 0;

	private Connections() {

	}

	public static Connections getInstance() {
		return instance;
	}

	public void connect() {
		try {
			sem.acquire();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		try {
			doConnect();
		} finally {
			sem.release();
		}
	}

	public void doConnect() {
		synchronized (this) {
			connections++;
			System.out.println("Current connections : " + connections);
		}
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		synchronized (this) {
			connections--;
		}
	}

}

public class SemaphoreEx {
	public static void main(String[] args) {
		Connections.getInstance().connect();
		ExecutorService executor = Executors.newCachedThreadPool();
		for(int i=0;i<200;i++) {
			executor.submit(new Runnable(){
				public void run() {
					Connections.getInstance().connect();
				}
			});
		}
		executor.shutdown();
		try {
			executor.awaitTermination(1, TimeUnit.DAYS);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
