package com.basic.questions;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class StringSorting {
	
	public static void main(String[] args) {
		String[] string = {"Rahul","Aman","Shyam","Rajesh"};
		Integer length = string.length;
		List<String> list = new ArrayList<>();
		for(int i=0;i<=length-1;i++) {
				list.add(string[i]);
		}
		List<String> sorted = list.stream().sorted().collect(Collectors.toList());
		System.out.println(sorted);
		System.out.println("Hiiii");
		list.stream().sorted(Comparator.reverseOrder()).forEach(System.out::println);
	}

}
