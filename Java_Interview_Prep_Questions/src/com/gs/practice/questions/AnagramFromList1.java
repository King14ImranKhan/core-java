package com.gs.practice.questions;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class AnagramFromList1 {
	public static void main(String[] args) {
		String[] arr = {"abc","cba","adc","efg","gfe"};
		Map<String,List<String>> map = new HashMap<>();
		Map<String,List<String>> map2 = new HashMap<>();
		Arrays.asList(arr).stream().filter(e->{
			char[] k=e.toCharArray();
			Arrays.sort(k);
			String sorted = new String(k);
			if(map.containsKey(sorted)) {
				map.get(sorted).add(e);
				return true;
			}else {
				List<String> list = new ArrayList<String>();
				list.add(e);
				map.put(sorted, list);
				map2.put(sorted, list);
				return true;
			}
		}).collect(Collectors.toList());
		System.out.println(map);
		System.out.println("Anagram map+ "+map2);
	}
}
