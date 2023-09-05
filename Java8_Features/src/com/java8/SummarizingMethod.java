package com.java8;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class SummarizingMethod {
	public static void main(String[] args) {

		Integer[] arr = { 2, 5, 4, 1, 7, 6 };
		Double average = Arrays.stream(arr).collect(Collectors.averagingInt(e -> e));
		System.out.println(average);
		int maximumValue = Arrays.stream(arr).collect(Collectors.summarizingInt(e -> e)).getMax();
		System.out.println(maximumValue);
		Long count = Arrays.stream(arr).collect(Collectors.counting());
		System.out.println(count);
		Long sum = Arrays.stream(arr).collect(Collectors.summarizingInt(e -> e)).getSum();
		System.out.println(sum);
		List<Integer> list1 = new ArrayList<>();
		List<Integer> list2 = new ArrayList<>();
		Arrays.stream(arr).filter(e -> {
			if (e % 2 == 0) {
				list1.add(e);
				return true;
			}
			list2.add(e);
			return true;
		}).collect(Collectors.toList());
		System.out.println("list 1 = "+list1);
		System.out.println("list 2 = "+list2);
		Map<Boolean, List<Integer>> obj=Arrays.stream(arr).collect(Collectors.partitioningBy(e->e%2==0));
		System.out.println(obj);
	}
}
