package com.multithreading.typesOfLock;

class Thread1 extends Thread{
	ObjectLevelLock2 object = null;
	Thread1(ObjectLevelLock2 object){
		this.object=object;
	}
	@Override
	public void run() {
		object.m1();
		object.m2();
	}
}
class Thread2 extends Thread{
	ObjectLevelLock2 object = null;
	Thread2(ObjectLevelLock2 object){
		this.object=object;
	}
	@Override
	public void run() {
		object.m1();
		object.m2();
	}
}
public class ObjectLevelLock2 {
	public static void main(String[] args) {
		ObjectLevelLock2 object1 = new ObjectLevelLock2();
		ObjectLevelLock2 object2 = new ObjectLevelLock2();
		Thread1 t1 = new Thread1(object1);
		Thread2 t2 = new Thread2(object2);
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
