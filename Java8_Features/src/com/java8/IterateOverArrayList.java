package com.java8;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.function.Consumer;

public class IterateOverArrayList {
	public static void main(String[] args) {
		List<Integer> list = Arrays.asList(4,5,6,7,0);
		Consumer<Integer> str = new Consumer<Integer>() {
			public void accept(Integer str) {
			System.out.print(str+2+" ");
			}
		};
		list.forEach(str);//First example to iterate
		list.forEach((i)->System.out.print(i+" "));//Second Example to iterate 
	
		Map<String, String> map = new HashMap<String, String>();
		 
		map.put("A", "Alex");
		map.put("B", "Brian");
		map.put("C", "Charles");
		 
		map.forEach((k, v) -> 
		    System.out.println("Key = " + k + ", Value = " + v));
	}

}
