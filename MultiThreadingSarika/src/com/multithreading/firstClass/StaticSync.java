package com.multithreading.firstClass;

class Table11{
	synchronized static void print(int n) { // class level lock
		for(int i=1;i<5;i++) {
			System.out.println(n+" * "+i+" = "+(i*n));
		}
		System.out.println("Hello");
	}
}

class Thread31 extends Thread{
	
	public void run() {
		try {
			Table11.print(3);
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}

class Thread51 extends Thread{
	
	public void run() {
		try {
			Table11.print(5);
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
public class StaticSync {
		public static void main(String[] args) {
			Thread31 t1= new Thread31();
			t1.start();
			Thread51 t2 = new Thread51();
			t2.start();
			
		}
}
