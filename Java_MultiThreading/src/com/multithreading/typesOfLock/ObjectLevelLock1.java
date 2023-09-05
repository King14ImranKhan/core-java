package com.multithreading.typesOfLock;
class ThreadEx1 extends Thread{
	ObjectLevelLock1 object = null;
	ThreadEx1(ObjectLevelLock1 object){
		this.object=object;
	}
	@Override
	public void run() {
		object.m1();
		object.m2();
	}
}
class ThreadEx2 extends Thread{
	ObjectLevelLock1 object = null;
	ThreadEx2(ObjectLevelLock1 object){
		this.object=object;
	}
	@Override
	public void run() {
		object.m1();
		object.m2();
	}
}
public class ObjectLevelLock1 {
	public static void main(String[] args) {
		ObjectLevelLock1 object = new ObjectLevelLock1();
		
		ThreadEx1 t1 = new ThreadEx1(object);
		ThreadEx2 t2 = new ThreadEx2(object);
		t1.start();
		t2.start();
	}
	public synchronized void m1() {
		System.out.println("in method m1() and thread name is "+Thread.currentThread().getName());
	}
	public synchronized void m2() {
		System.out.println("in method m2() and thread name is "+Thread.currentThread().getName());
	}
}
