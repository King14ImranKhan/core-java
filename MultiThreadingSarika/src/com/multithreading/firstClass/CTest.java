//interface Runnable{
//	public void run() {
//		
//	}
//}
//
//class Thread implements Runnable{
//	@Override
//	public void run() {empty}
//}
//   class Thread providea two types of constructors
//   {
//	   Thread(){}
//	   Thread(Runnable r){}
//   }
//It is in Thread class
//start() {
// 1.mandatory operation
//2. call run()
// }
//getName(){} setName(){}

//What will happen if we do not override run method in child class
//If we don't override run method then Thread class run method will be called.
// *Mandatory Operation that start method do-
//
package com.multithreading.firstClass;


public class CTest extends Thread {
	public void run() {   // running state
		System.out.println("Hello Thread.."); // job
		
		try {
			Thread.sleep(100000);   // Non-Runnable state
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	} // terminated/dead state after completion of run method.
	// after completion of run method thread is in dead state or terminated state

	public static void main(String[] args) {
		CTest t1 = new CTest(); // new state
		t1.start();  // Runnable state
		// Can we call run() method directly here
		t1.run();//Yes it can be called but it will act as normal method
		// but when we call start method then it perform some mandatory operations first
	}
}
