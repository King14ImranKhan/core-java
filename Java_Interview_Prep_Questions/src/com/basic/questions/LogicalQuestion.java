package com.basic.questions;

interface AB {
	public default void h1() {
		System.out.println("h1");
	}
}

interface A {
	public default void h1() {
		System.out.println("h2");
	}
}

public class LogicalQuestion implements AB, A {
	public static void main(String[] args) {
		LogicalQuestion lq = new LogicalQuestion();
		lq.h1();
	}

	@Override
	public void h1() {
		// TODO Auto-generated method stub
		A.super.h1();
	}

}
