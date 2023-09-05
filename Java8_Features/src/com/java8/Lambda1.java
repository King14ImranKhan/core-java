package com.java8;

interface A{
	void show();
}
class B implements A{

	@Override
	public void show() {
		System.out.println("Hello");
		
	}	
}
public class Lambda1 {
	public static void main(String[] args) {
		A obj = new B(); 
		obj.show();
	}

}
