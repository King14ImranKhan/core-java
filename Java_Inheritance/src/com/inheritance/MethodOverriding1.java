package com.inheritance;

class Parent {
	public void m1() {
		System.out.println("imran");
	}
}

class Child extends Parent {
	static class A {

	}

	public void m1() {
		System.out.println("khan");
	}
}

public class MethodOverriding1 {
	public static void main(String[] args) {

		Parent obj1 = new Child();
		obj1.m1();
		Child obj2 = new Parent();// Not Possible

	}
}
