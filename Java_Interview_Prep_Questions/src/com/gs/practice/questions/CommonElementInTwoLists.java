package com.gs.practice.questions;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class CommonElementInTwoLists {
	public static void main(String[] args) {
		List<Integer> list1 = Arrays.asList(2,1,5,6);
		List<Integer> list2 = Arrays.asList(1,6,8,9);
		
		list1.stream().filter(e->{
			if(list2.contains(e)) {
				return true;
			}
			return false;
		}).collect(Collectors.toList()).forEach(System.out::println);
	}
}
