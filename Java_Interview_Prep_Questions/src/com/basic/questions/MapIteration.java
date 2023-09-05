package com.basic.questions;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class MapIteration {
	public static void main(String[] args) {
		Map<Integer,Integer> map = new HashMap<Integer, Integer>();
		map.put(1, 10);
		map.put(2, 20);
		map.put(3, 30);
		//To get all keys
		Set<Integer> k =map.keySet();
		System.out.println(k);
		//Iterate through foreach loop
		for(Map.Entry<Integer, Integer> entry : map.entrySet()) {
			System.out.println(entry.getKey()+" "+entry.getValue());
		}
		map.forEach((key,value)->{
			System.out.println(key+" "+value);
			}
		);
	}

}
