package com.basic.questions;
import java.util.HashMap;
import java.util.Map;

interface F1 {
	void m1();
}

@FunctionalInterface
interface F2 extends F1 {
	void m1();
}

public class HashMapGet {
	public static void main(String[] args) {
		Map<String, Integer> map = new HashMap<>();
		map.put("imran", 104);
		System.out.println(map.get("imran").hashCode());
		map.put(new String("imran"), 105);
		System.out.println(map.get("imran").hashCode());
		//System.out.println(map.get("imran").longValue()+"   pppppppppppp");
		
		for (Map.Entry<String, Integer> entry : map.entrySet()) {
			System.out.println(entry.getKey() + "/" + entry.getValue());
		}
	}
}
