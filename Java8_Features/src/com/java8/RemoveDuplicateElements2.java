package com.java8;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.stream.Collectors;

public class RemoveDuplicateElements2 {
	public static void main(String[] args) {
		// LinkedHashSet
		List<Integer> list = Arrays.asList(2, 4, 1, 2, 6, 7, 8, 4);
		LinkedHashSet<Integer> linked = new LinkedHashSet<>(list);
		ArrayList<Integer> removedDuplicates = new ArrayList<>(linked);
		System.out.println(removedDuplicates);

		// Streams
		List<Integer> list2 = Arrays.asList(2, 4, 1, 2, 6, 7, 8, 4);
		List<Integer> removeList2Duplicate = list2.stream().distinct().collect(Collectors.toList());
		System.out.println(removeList2Duplicate);
	}

}
