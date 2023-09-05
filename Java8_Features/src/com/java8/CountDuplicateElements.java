package com.java8;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class CountDuplicateElements {
	public static void main(String[] args) {
		List<Integer> list = Arrays.asList(2,4,1,2,6,7,8,4);
		 list.stream().filter(integer -> list.indexOf(integer) != list.lastIndexOf(integer))
         .collect(Collectors.toSet())
         .forEach(System.out::println);
	}

}
