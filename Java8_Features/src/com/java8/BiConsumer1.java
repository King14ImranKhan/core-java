package com.java8;

import java.util.HashMap;
import java.util.Map;
import java.util.function.BiConsumer;

//BiConsumer Interface accepts two input arguments and does not return any result. This is the two-arity specialization of Consumer interface. 
//It provides a functional method accept(Object, Object) to perform custom operations.

public class BiConsumer1 {
	static void ShowDetails(Map<Integer, String> map, String mapName) {
		System.out.println(mapName);
		
		map.forEach((key, val) -> System.out.println(key + " " + val));
	}

	public static void main(String[] args) {
		Map<Integer, String> map = new HashMap<Integer, String>();
		map.put(100, "Mohan");
		map.put(110, "Sujeet");
		map.put(115, "Tom");
		map.put(120, "Danish");
		// Referring method
		BiConsumer<Map<Integer, String>, String> biCon = BiConsumer1::ShowDetails;
		biCon.accept(map, "Student");
	}
}