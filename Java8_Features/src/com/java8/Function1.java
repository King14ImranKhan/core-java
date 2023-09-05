package com.java8;

import java.util.function.Function;

//Function is a functional interface; it takes an argument (object of type T) and returns an object (object of type R). The argument and output 
//can be a different type.


public class Function1 {
	static String show(String message) {
		return "Hello " + message;
	}

	public static void main(String[] args) {
		Function<String, String> fun = Function1::show;
		System.out.println(fun.apply("Peter"));
	}
}