package com.basic.questions;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class ArraySort {
	public static void main(String[] args) {
		Integer[] array = { 9, 4, 5, 2 };
	   List<Integer>  list= Arrays.asList(array);
	   
	   char[] obj = {'a','b','d','c'};
	   Arrays.sort(obj);
	   String s = new String(obj);
	   System.out.println(s);
	   list.stream().forEach(System.out::println);
	}
}
