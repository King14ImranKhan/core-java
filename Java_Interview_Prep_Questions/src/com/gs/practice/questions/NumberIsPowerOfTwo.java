package com.gs.practice.questions;
//128 =2*2*2*2*2*2*2 = 2 to the power 5
public class NumberIsPowerOfTwo {

	// Approach 1
	public static boolean checkPowerOfTwo(int n) {
		while (n % 2 == 0) {
			n = n / 2;
		}
		if (n == 1) {
			return true;
		} else {
			return false;
		}
	}

	public static void main(String[] args) {
		System.out.println("128 is power of two : " + checkPowerOfTwo(128));

	}

}