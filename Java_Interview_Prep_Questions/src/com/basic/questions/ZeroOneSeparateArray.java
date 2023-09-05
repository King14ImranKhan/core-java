package com.basic.questions;

public class ZeroOneSeparateArray {
	public static void main(String[] args) {

		int[] arr = { 0, 1, 1, 1, 0, 0, 1, 1 };
		int left = 0;
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] == 0) {
				int temp = arr[left];
				arr[left] = arr[i];
				arr[i] = temp;
				left++;
			}
		}
		int x;
		for (int i = 0; i < arr.length; i++) {
			x = arr[i];
			System.out.print(x + ",");
		}
	}
}
