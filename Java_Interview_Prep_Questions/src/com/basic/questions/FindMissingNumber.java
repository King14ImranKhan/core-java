package com.basic.questions;
import java.util.Arrays;
import java.util.List;

public class FindMissingNumber {
	public static void main(String[] args) {
		Integer[] number = { 1, 2, 3, 4, 5, 7, 8, 9 };
		List<Integer> p = Arrays.asList(number);
		int i = 0;
		for (int j=1;j<=9;j++) {
			if(j!=p.get(i)) {
				System.out.println(p.get(i).intValue()-1);
				break;
			}
			i++;
		}

	}

}
