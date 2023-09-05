package com.java7.object.cloning;

class SingletonClass{
	static SingletonClass obj = new SingletonClass();
	private SingletonClass() {
	}
	public static SingletonClass getInstance() {
		return obj;
	}
}
public class Singleton {
	public static void main(String[] args) {
		SingletonClass obj1 = SingletonClass.getInstance();
		SingletonClass obj2 = SingletonClass.getInstance();
		System.out.println(obj1);
		System.out.println(obj2);
		
	}

}
