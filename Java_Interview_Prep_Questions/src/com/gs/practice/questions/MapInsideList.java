package com.gs.practice.questions;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class MapInsideList {
	public static void main(String[] args) {
		List<Map<String,Integer>> list = new ArrayList<>();
		Map<String,Integer> map = new HashMap<>();
		map.put("imran", 2);
		list.add(map);
		map.put("rahul", 4);
		list.add(map);
		System.out.println(list);
	}
}
