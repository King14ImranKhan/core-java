package com.string;

public class String_SubString_Combinations {

	public static void main(String[] args) {
		String str = "ABC";
		int length = str.length();
		int temp = 0;
		String[] arr = new String[length * (length + 1) / 2];
		for (int i = 0; i < length; i++) {
			for (int j = i; j < length; j++) {
				arr[temp] = str.substring(i, j + 1);
				temp++;
			}
		}
		System.out.println("All subsets for given string are: ");
		for (int i = 0; i < arr.length; i++) {
			System.out.println(arr[i]);
		}
	}
}
