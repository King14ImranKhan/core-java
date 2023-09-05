package com.basic.questions;
//How many static methods can a functional interface have?
//Java Functional Interfaces. An Interface that contains exactly one abstract
//method is known as functional interface. It can have any number of default,
//static methods but can contain only one abstract method.
interface LambdaAddition{
	int f1(int a,int b);
}
public class LambdaAdd {
	public static void main(String[] args) {
		LambdaAddition k = (s,d)->(s+d);
		int j =k.f1(6, 9);
		System.out.println(j);
	}

}
