package com.gs.practice.questions;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class MapGetWithAdd {
	public static void main(String[] args) {
		String[] p = {"imran","khan"};
		Map<String,List<String>> map =new HashMap<>();
		List<String> list = new ArrayList<>();
		for(String k1:p) {
			list.add(k1);
			map.put(k1,list);
			map.get(k1).add("imran");
			System.out.println(map);
		}
		
	}
}
