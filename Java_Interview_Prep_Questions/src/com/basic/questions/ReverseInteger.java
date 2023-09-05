package com.basic.questions;

class Reverse {
	void reverse(int num) {
		int reverse = 0;
		while (num != 0) {
			int remainder = num % 10;
			reverse = reverse * 10 + remainder;
			num = num / 10;
		}
		System.out.println(reverse);
	}
}

public class ReverseInteger {
	public static void main(String[] args) {
		Reverse obj = new Reverse();
		obj.reverse(1987);
	}
}
