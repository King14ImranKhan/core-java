package com.series;

class SD{
	public void m1(int n) {
		System.out.println("Hello");
	}
public void m2(String n) {
		System.out.println("GHello");
	}
}
public class LogicalQuestion {
	public static void main(String[] args) {
		SD obj = new SD();
		//obj.m1(null);
		obj.m2(null);
	}
}
