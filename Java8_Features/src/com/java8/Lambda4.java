package com.java8;

interface DemoClass {
	void show(int i);
}

public class Lambda4 {
	public static void main(String[] args) {
		DemoClass obj;
		obj = (i) -> System.out.println("Hello  "+i);
		obj.show(6);
	}
}
