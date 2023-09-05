package com.java8;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class RemoveDuplicateElements1 {
	public static void main(String[] args) {
		List<Integer> list = Arrays.asList(3, 5, 1, 6, 2, 5, 1);
		int count = 0;
		for (int i : list) {
			
			for (int j = 0; j < list.size(); j++) {
				if(list.get(i)==list.get(j)) {
				System.out.println(list.get(j));
				}
			}
			
		}

	}
}
