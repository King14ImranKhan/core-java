package com.java8;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class FindDuplicateNumbers {
	public static void main(String[] args) {
		List<Integer> listA = Arrays.asList(3,5,1,2,7);
		List<Integer> listB = Arrays.asList(3,0,9,8,7);
		for(int duplicate : listA) {
			if(listB.contains(duplicate)) {
			System.out.print(duplicate+",");
			}
		}
		List<Integer> result = listA.stream().filter(num->listB.contains(num)).collect(Collectors.toList());
		System.out.println(result);
 	}

}
