package com.java8;
@FunctionalInterface
interface interfDefault{
	public void m1();
	public default void m2(){
		int a=10,b=40,c;
		c=a+b;
		System.out.println(c);
	}
	public default void m3(){
		int a=12,b=42,c;
		c=a+b;
		System.out.println(c);
	}
}

public class DefaultMethod2 implements interfDefault{
	public static void main(String[] args) {
		DefaultMethod2 obj =new DefaultMethod2();
		obj.m1();
		obj.m2();
		obj.m3();
	}
	/* Overriding default method from Functional Interface
	but default keyword will be removed from there */
	@Override 
	public void m3(){
		int a=100,b=200,c;
		c=a+b;
		System.out.println(c);
	}
    
	@Override
	public void m1() {
		
		System.out.println("imran");
	}

}
