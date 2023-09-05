package com.java8;
// Static methods are not related to Objects
//Interface static methods are not available to implementation class
//Even without implementation of class we can access static methods of interface.
interface Calculator{
	public static int calculate(int a,int b) {
		int sum=a+b;
		return sum;
	}
	public static void calculate2(int a,int b) {
		int sum2=a+b;
		System.out.println(sum2);
	}
}
public class StaticMethod1 {
	public static void main(String[] args) {
		Integer sum = Calculator.calculate(10,20);
		System.out.println(sum);
		
		Calculator.calculate2(20,40);
	}

}
