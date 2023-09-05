package com.java8;

interface Interf1{
	int f1(int a,int b);
}
public class LambdaReturn1 {
	public static void main(String[] args) {
		Interf1 interf = (a,b)->(a+b);
		System.out.println(interf.f1(10, 20));
	}

}
