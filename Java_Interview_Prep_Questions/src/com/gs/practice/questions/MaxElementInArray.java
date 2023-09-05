package com.gs.practice.questions;

import java.util.Arrays;

public class MaxElementInArray {
	public static void main(String[] args) {
		Integer[] arr = { 10, 324, 45, 90,101010, 9808 };
		int max = arr[0];
		for (int i = 1; i < arr.length; i++) {
			if (arr[i] > max) {
				max = arr[i];
			}
		}
		System.out.println(max);
		Integer result = Arrays.asList(arr).stream().max(Integer::compare).get();
		Integer result1 = Arrays.asList(arr).stream().min(Integer::compare).get();
		System.out.println(result);
		System.out.println(result1);
	}
}
