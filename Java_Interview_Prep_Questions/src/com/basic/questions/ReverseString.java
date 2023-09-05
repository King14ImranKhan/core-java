package com.basic.questions;

public class ReverseString {
	public static void main(String[] args) {
		String str = "imran khan";
		char[] strChar = str.toCharArray();
		System.out.println();
		for (int i = strChar.length-1; i >= 0; i--) {
			System.out.print(strChar[i]);
		}
	}

}
