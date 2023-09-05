package com.sarika.session.questions;

import java.util.Arrays;
import java.util.List;
import java.util.Map;

public class PartitionListOddEven {
	public static void main(String[] args) {
		List<Integer> myList = Arrays.asList(1,2,3,4,5,6,7,8,9,10);

		Map<Boolean, List<Integer>> evenAndOdds = myList.stream()
		        .collect(partitioningBy(i -> i % 2 == 0));
	}
}
