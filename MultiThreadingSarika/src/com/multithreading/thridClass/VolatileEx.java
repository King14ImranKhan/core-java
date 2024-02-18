package com.multithreading.thridClass;

public class VolatileEx {
	static volatile boolean flag = false;

	public static void main(String[] args) {
		new Thread(new Runnable() {

			@Override
			public void run() {
				while (!flag) { 
					System.out.println("Thread is running..");
					try {
						Thread.sleep(1000);
					} catch (InterruptedException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
				}
				System.out.println("Thread stopped..");
			}
		}).start();
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		flag = true;
	}
}

//When a variable is declared as volatile, it affects how the variable is stored and accessed in main memory by different threads. In a multithreaded environment, each thread has its own cache or working memory where it stores variables that it frequently uses. The use of volatile ensures that changes to the variable are immediately visible to other threads, bypassing the thread's local cache.
//
//Here's how it works:
//
//Visibility in Main Memory:
//
//When a thread writes to a volatile variable, the updated value is immediately flushed from the thread's local cache to main memory.
//When a thread reads a volatile variable, it reads the value directly from main memory, ensuring that it sees the most recent update made by other threads.
//No Caching in Thread's Local Memory:
//
//Threads do not cache the value of a volatile variable in their local memory.
//Every read or write operation on a volatile variable involves main memory.
