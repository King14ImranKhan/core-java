package com.java8;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class RemoveDuplicateElements3 {
	public static void main(String[] args) {
		List<Integer> list = Arrays.asList(3, 5, 2, 2, 6, 7, 7);
		System.out.println("Hii" + list.stream().distinct().collect(Collectors.toList()));
		Set<Integer> set = new HashSet<>(list);
		for (Integer i : set) {
			System.out.println(i);
		}
	}

}
