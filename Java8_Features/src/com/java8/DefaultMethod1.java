package com.java8;
// Without affecting implementation class we can add new method in interface.
// We can override default method in implementation class but using public keyword.
// Object class methods like hashcode, equals etc can't be used as default. 
interface Calculator4{
	public default void m1() {
		System.out.println("Defaut method");
	}
	public default void m2(int a,int b) {
		int sum = a+b;
		System.out.println(sum);
	}
	public default int m3(int a,int b) {
		int sum = a+b;
		return sum;
		
	}
}
public class DefaultMethod1 implements Calculator4{
	public void m1(){
		System.out.println("Overrridden Default Method");
	}
	public static void main(String[] args) {
		Calculator4 obj = new DefaultMethod1();
		obj.m2(10,20);
		obj.m1();
		int sum = obj.m3(40,50);
		System.out.println(sum);
		
	}
}
