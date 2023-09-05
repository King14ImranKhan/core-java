package com.java7.object.cloning;

class Singleton1{
	static Singleton1 obj;
	private Singleton1() {
	}
	public static synchronized Singleton1 getInstance() {
		if(obj==null) {
			obj=new Singleton1();
		}
		return obj;
	}
}
public class SingletonDoubleCheck {
	public static void main(String[] args) {
		Singleton1 obj1 = Singleton1.getInstance();
		Singleton1 obj2 = Singleton1.getInstance();
		System.out.println(obj1);
		System.out.println(obj2);
		
	}
}
