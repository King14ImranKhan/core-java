package com.sarika.session.questions;

import java.util.Arrays;
import java.util.stream.Collectors;

public class MaxOddNumberCountArray {
	public static void main(String[] args) {
		Integer i[] = {1,2,1,3,4,5,6,4};
		Arrays.asList(i).stream().map(e->e).collect(Collectors.groupingBy(i[e]));
	}
}
