package com.hackerrandquestions;
//How can we create a symbolic link to file Java?
//Files class. isSymbolicLink(Path p) method checks if the file specified by the specified path is a symbolic link. 
//createSymbolicLink() method of the Files, which may not be supported on all platforms, creates a symbolic link. 

//What is the purpose of BooleanSupplier function in Java 8?
//The BooleanSupplier Interface is a part of the java. util. function package which has been introduced since Java 8,
//to implement functional programming in Java. It represents a function which does not take in any argument but produces 
//a boolean value.
//Represents a supplier of boolean -valued results.
public class MCQ2 {
public static void main(String[] args) {
	MCQ2 obj = new MCQ2();
	obj.test();
}
public void test() {
	try {
		System.out.println("imran");
	}catch(Exception e) {
		System.out.println(e);
	}finally {
		System.out.println("imrankhan");
	}
}
}
