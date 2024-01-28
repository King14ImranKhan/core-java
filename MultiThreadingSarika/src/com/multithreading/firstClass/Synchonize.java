package com.multithreading.firstClass;

class Table{
	// Table t = new Table();
		synchronized void print(int n) { // object level lock //this is method 
		//synchronized(this) {  //object level lock   -> both are object level lock  // this is block
			for(int i=0;i<5;i++) {
				System.out.println(n+" * "+i+" = "+(i*n));
			}
		}
		//System.out.println("Hello");
	}

class Thread3 extends Thread{
	Table t;
	public Thread3(Table t) {
		this.t=t;
	}
	
	public void run() {
		
		try {
			t.print(3);
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}

class Thread5 extends Thread{
	Table t;
	public Thread5(Table t) {
		this.t=t;
	}
	
	public void run() {
		try {
			t.print(5);
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
public class Synchonize {
	public static void main(String[] args) {
		Table t = new Table();
		Thread3 t1 = new Thread3(t);
		t1.start();
		
		Thread5 t2 = new Thread5(t);
		t2.start();
	}

}
// Here t1 and t2 both will try to get access to print()
//If any of the object from the class is going to get the lock, we call that object level lock
// So whenever we are making thread method or thread block lock, it is object level lock 