package com.basic.questions;
public class MethodOverloadingReverse {

	static void reverse(int num) {
		int reverse = 0;
		while (num != 0) {
			int remainder = num % 10;
			reverse = reverse * 10 + remainder;
			num = num / 10;
		}
		System.out.println(reverse);
	}

	static void reverse(String value) {
		char[] array = value.toCharArray();
		String reverse = "";
		for (int i = array.length - 1; i >= 0; i--) {
			reverse = reverse + array[i];
		}
		System.out.println(reverse);
	}

	public static void main(String[] args) {

		reverse("imran");
		reverse(109);
	}
}
