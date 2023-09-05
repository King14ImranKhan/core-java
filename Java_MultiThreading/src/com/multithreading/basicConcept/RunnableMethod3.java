package com.multithreading.basicConcept;

class RunnableInterfaceExample implements Runnable{

	@Override
	public void run() {
		System.out.println("Hello Imran");
		
	}
	
}
public class RunnableMethod3 {
	public static void main(String[] args) {
		RunnableInterfaceExample runnable = new	RunnableInterfaceExample();
		Thread thread = new Thread(runnable);
		thread.start();
	}

}
