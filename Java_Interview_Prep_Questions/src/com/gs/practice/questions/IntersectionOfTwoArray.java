package com.gs.practice.questions;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class IntersectionOfTwoArray {
	public static void main(String args[]) {
		Integer[] myArray1 = { 23, 36, 96, 78, 55 };
		Integer myArray2[] = { 78, 45, 19, 73, 55 };
		List<Integer> result = new ArrayList<>();
		System.out.println("Intersection of the two arrays ::");

		for (int i = 0; i < myArray1.length; i++) {
			for (int j = 0; j < myArray2.length; j++) {
				if (myArray1[i] == myArray2[j]) {
					System.out.println(myArray2[j]);
				}
			}
		}
		List<Integer> list1 = Arrays.asList(myArray1);
		List<Integer> list2 = Arrays.asList(myArray2);
		for(Integer value : list1) {
			if(list2.contains(value)) {
				result.add(value);
			}
		}
		System.out.println(result);
	}
}
