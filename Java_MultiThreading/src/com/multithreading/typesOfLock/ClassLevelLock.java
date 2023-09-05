package com.multithreading.typesOfLock;

class ThreadExp1 extends Thread {
	ClassLevelLock object1 = null;

	@Override
	public void run() {
		object1.m1();
		object1.m2();
	}
}

class ThreadExp2 extends Thread {
	ClassLevelLock object2 = null;

	@Override
	public void run() {
		object2.m1();
		object2.m2();
	}
}

public class ClassLevelLock {
	public static void main(String[] args) {

		ThreadExp1 t1 = new ThreadExp1();
		ThreadExp2 t2 = new ThreadExp2();
		t1.start();
		t2.start();
	}

	public static synchronized void m1() {
		System.out.println("in method m1() and thread name is " + Thread.currentThread().getName());
	}

	public static synchronized void m2() {
		System.out.println("in method m2() and thread name is " + Thread.currentThread().getName());
	}
}
