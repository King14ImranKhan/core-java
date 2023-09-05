package com.gs.practice.questions;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.stream.Collectors;

public class RepeatingElement {
	public static void main(String[] args) {
		String str = "mohammadImran";
		String[] array = str.split("");
		Map<String, List<Integer>> map = new HashMap<>();
		for (int i = 0; i < array.length; i++)
		{
			List<Integer> list = new ArrayList<>();
			for (int j = i + 1; j < array.length; j++) {
				if (array[i].equalsIgnoreCase(array[j])) {
					if (!map.containsKey(array[i])) {
						list.add(i);
						list.add(j);
						map.put(array[i], list);

					} else  {
						break;
					} 
				}
			}
		}
		System.out.println(map);
		List<Entry<String, List<Integer>>> l=map.entrySet().stream().sorted((o1,o2)->o1.getValue().get(1).compareTo(o2.getValue().get(1))).collect(Collectors.toList());
		System.out.println(l.get(0).getKey());
	}
}
