package com.basic.questions;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class IntegerSorting {
public static void main(String[] args) {
	int[] num = {9,7,8,4,5,3};
	int length = num.length;
	List<Integer> list = new ArrayList<>();
	for(int i=0;i<length;i++) {
		list.add(num[i]);
	}
	List<Integer> sorted = list.stream().sorted().collect(Collectors.toList());
	System.out.println(sorted);
}
}
