package com.string;

import java.util.HashMap;
import java.util.Map;

public class MostRecurringCharacter {
	public static void main(String[] args) {
		Map<Character,Integer> map = new HashMap<>();
		String str = "imrankhan";
		char[] ch = str.toCharArray();
		for(char c : ch) {
			int count=0;
			for(int i=0;i<ch.length;i++) {
				if(c==ch[i]) {
					count++;
					map.put(c, count);
				}
			}
		}
		System.out.println(map);
		map.entrySet().stream().sorted((o1,o2)->o2.getValue().compareTo(o1.getValue())).limit(2).skip(1).forEach(System.out::println);
		
	}
}
