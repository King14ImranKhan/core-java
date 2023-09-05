package com.java8;

interface Sayable {// Always should be Functional Interface
	void say();
}

interface Sayabled { // Always should be Functional Interface
	void say(String s);
}

class Check {
	Check() {
		System.out.println("variable");
	}

	Check(String variable) {
		System.out.println(variable);
	}

	void check1() {
		System.out.println("Hello");
	}

	void check2() {
		System.out.println("Hi");
	}

	static void check3() {
		System.out.println("Happy");
	}
}

public class ReferenceMethod3 {
	public void saySomething() {
		System.out.println("Hello, this is non-static method.");
	}

	public static void main(String[] args) {
		ReferenceMethod3 methodReference = new ReferenceMethod3(); // Creating object
		// Referring non-static method using reference
		Sayable sayable = methodReference::saySomething;
		// Calling interface method
		sayable.say();
		// Referring non-static method using anonymous object
		Sayable sayable2 = new ReferenceMethod3()::saySomething; // You can use anonymous object also
		// Calling interface method
		sayable2.say();
		Sayable nonstatic = new Check()::check2;
		nonstatic.say();
		Sayable staticMethod = Check::check3;
		staticMethod.say();
		Sayabled constructor = Check::new;
		constructor.say("Constructor with parameter");
	}
}
