package com.series;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class AnagramsFromList {
	public static void main(String[] args) {
		String[] arr = { "bac", "cba", "zzz", "zyx", "xyz" };
		Map<String, List<String>> resultMap = new HashMap<String, List<String>>();
		for (String value : arr) {
			char[] characters = value.toLowerCase().toCharArray();
			Arrays.sort(characters);
			String sortedValue = new String(characters);
		//	System.out.println(sortedValue);
			if (resultMap.containsKey(sortedValue)) {
				resultMap.get(sortedValue).add(value);
			} else {
				List<String> list = new ArrayList<String>();
				list.add(value);
				resultMap.put(sortedValue, list);
			}
		}
		System.out.println(resultMap);
	}
}