package com.string;

public class Sorting1 {
	public static void main(String[] args) {
		Integer[] obj = { 4, 1, 3, 8, 7 };
		for (int i = 0; i < obj.length; i++) {
			for (int j = i+1; j < obj.length; j++) {
				int temp;
				if (obj[i] > obj[j]) {
					temp = obj[i];
					obj[i] = obj[j];
					obj[j] = temp;
				}
			}
			System.out.print(obj[i]+" ");
		}
	}
}
