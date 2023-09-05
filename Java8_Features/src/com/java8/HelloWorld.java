package com.java8;
interface Interf2{
	void f1();
}
public class HelloWorld {
	public static void main(String[] args) {
		Interf2 obj = ()->System.out.println("Hello");
		obj.f1();// through Lambda Expression
		Interf2 arg0 = new Interf2() {
			@Override
			public void f1() {
				System.out.println("Hello Annonymous");
				
			}
		};
		arg0.f1();//Through Anonymous class
	}

}
