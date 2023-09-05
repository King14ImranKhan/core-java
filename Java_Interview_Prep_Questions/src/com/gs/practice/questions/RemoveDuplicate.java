package com.gs.practice.questions;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class RemoveDuplicate {
	public static void main(String[] args) {
		Integer[] arr = {2,2,4,3,3};
		List<Integer> obj = Arrays.asList(arr);
		Set<Integer> j = new HashSet<>(obj);
		System.out.println(j);
	}
}
