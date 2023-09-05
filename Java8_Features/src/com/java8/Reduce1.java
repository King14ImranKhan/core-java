package com.java8;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Reduce1 {
	public static void main(String[] args) {
		List<Integer> list = Arrays.asList(4, 5, 3, 2, 1);
		int result = 0;
		for (Integer i : list) {
			result = result + i;
		}
		System.out.println(result);
		int map = list.stream().mapToInt(a -> a).sum();
		System.out.println(map);

		List<Integer> filter = list.stream().filter(i -> i % 2 == 0).collect(Collectors.toList());
		System.out.println(filter);
		// filter() to filter stream elements on the basis of given Predicate(Boolean).
		// Suppose you want to get only even elements of your list then you can do this
		// easily with the help of filter method.

		Integer reduce = list.stream().reduce(0, (a, b) -> a + b);
		System.out.println(reduce);
		List<Integer> mapMultiply = list.stream().map(i -> i * 2).collect(Collectors.toList());
		System.out.println(mapMultiply);
		// map method is used to do operation
	}

}
