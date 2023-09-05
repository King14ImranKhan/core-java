package com.java8;

interface Interface1{
	public static void getStaticMethod() {
		System.out.println("My Name is Imran Khan");
	}
	public default void getDefaultMethod() {
		System.out.println("Hello");
	}
}
public class StaticMethod2 implements Interface1 {
	public static void main(String[] args) {
		StaticMethod2 obj= new StaticMethod2();
		Interface1.getStaticMethod();
		obj.getDefaultMethod();
	}

}
