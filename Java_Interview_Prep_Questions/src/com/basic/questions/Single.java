package com.basic.questions;
class Abc{
	static Abc obj = new Abc();
	Abc() {
		
	}
	static Abc getInstance() {
		return obj;
	}
}
public class Single {
 public static void main(String[] args) {
	Abc s1 = new Abc();
	System.out.println(s1.getInstance());
	Abc s2 = new Abc();
	System.out.println(s2.getInstance());
	
}
}
