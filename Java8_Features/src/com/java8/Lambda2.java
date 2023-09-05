package com.java8;


import java.util.Arrays;

public class Lambda2 {
	public static void main(String[] args) {
		java.util.List<Integer> values = Arrays.asList(6, 3, 5, 7, 2);
		values.forEach(i -> System.out.println(i));// This line implements some
		// interface that is consumer interface and we tried to print with Lambda
		// expression
	}
}
