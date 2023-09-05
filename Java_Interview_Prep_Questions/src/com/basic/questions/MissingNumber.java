package com.basic.questions;
import java.util.Arrays;

public class MissingNumber {
	public static void main(String[] args) {
		int[] numbers = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 11, 12 };

		int n = 12;
		int idealSum = (n * (n + 1)) / 2;
		int sum = Arrays.stream(numbers).sum();
		int missingNumber = idealSum - sum;
		System.out.println(missingNumber);
		
	}
}
