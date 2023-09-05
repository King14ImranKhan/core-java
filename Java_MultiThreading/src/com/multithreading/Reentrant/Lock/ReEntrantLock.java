package com.multithreading.Reentrant.Lock;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

/*java.util.concurrent.locks.ReentrantLock is a mutually exclusive lock with the same behaviour
 * as the intrinsic/implicit lock accessed via the synchronized keyword.
 * Reentrant lock, as the name suggests,possesses reentrant characteristics. That means a 
 * thread that currently owns the lock can acquire it more than once without any problem. 
 */
class Counter {
	private final Lock lock = new ReentrantLock();
	private int count = 0;

	// Thread safe increment
	public void increment() {
		lock.lock();
		try {
			count = count + 1;
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			if (lock != null) {
				lock.unlock();
			}
		}
	}

	public int getCount() {
		return count;
	}
}

public class ReEntrantLock {
	public static void main(String[] args) {
		ExecutorService executorService = null;
		try {
			executorService = Executors.newFixedThreadPool(2);
			final Counter counter = new Counter();
			Runnable task1 = new Runnable() {

				@Override
				public void run() {
					for (int i = 1; i <= 1000; i++) {
						counter.increment();
					}

				}
			};
			Runnable task2 = new Runnable() {

				@Override
				public void run() {
					for (int i = 1; i <= 2000; i++) {
						counter.increment();
					}

				}
			};
			executorService.submit(task1);
			executorService.submit(task2);
			executorService.awaitTermination(3, TimeUnit.SECONDS);
			System.out.println(counter.getCount());
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			if (executorService != null) {
				executorService.shutdown();
			}
		}
	}
}
