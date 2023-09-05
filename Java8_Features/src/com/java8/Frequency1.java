package com.java8;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.function.Function;
import java.util.stream.Collectors;

public class Frequency1 {
	public static void main(String[] args) {
		List<Integer> list = Arrays.asList(1,2,3,4,5,5,5,4,3,7);
		Map<Integer,Integer> map = list.stream().collect(Collectors.toMap(k->k, v->1,Integer::sum));
		System.out.println(map);
		System.out.println("<--------------->");
		List<Entry<Integer, Integer>> list1=map.entrySet().stream().sorted((o1,o2)->o2.getKey().compareTo(o1.getKey())).collect(Collectors.toList());
		System.out.println(list1);
		System.out.println("<--------------->");
		Map<Integer, Long> map1=list.stream().collect(Collectors.groupingBy(Function.identity(),Collectors.counting()));
		System.out.println(map1);
		
	}
}
