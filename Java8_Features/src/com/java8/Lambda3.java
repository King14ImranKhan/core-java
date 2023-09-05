package com.java8;

interface IF1 {
	void show1();
}
interface IF2 {  // Functional interface
	void show();
}
public class Lambda3 {
	public static void main(String[] args) {
		IF2 obj;
		obj = new IF2() { // now it is Anonymous inner class Java-8
			public void show() {
				System.out.println("Hello");
			}
		};
		obj.show();
		IF1 obj1;
		obj1 = () -> System.out.println("Hello");
	// For initialization obj1 this snippet of code here above obj1.show()
		obj1.show1();
	}
}
