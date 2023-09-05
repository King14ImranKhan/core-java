package com.basic.questions;
import java.util.HashMap;
import java.util.Map;
import java.util.stream.Collectors;

public class SortMapJava8 {
	public static void main(String[] args) {
		Map<Integer,Integer> map = new HashMap<Integer, Integer>();
		map.put(9, 10);
		map.put(2, 20);
		map.put(3, 30);
		Map<Integer, Integer> l =map.entrySet().stream().sorted((o1,o2)->o1.getKey().compareTo(o2.getKey())).collect(Collectors.toMap(e->e.getKey(), e->e.getValue()));
		System.out.println(l);
	}
}
