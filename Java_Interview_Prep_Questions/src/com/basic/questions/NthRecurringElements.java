package com.basic.questions;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class NthRecurringElements {
	static int getFirstRepeatingElementArray(int array[]) {
		int minimumIndex = -1;
		Map<Integer,List<Integer>> map = new HashMap<>();
		for (int i = array.length - 1; i >= 0; i--) {
			if (map.containsKey(array[i]))
				//minimumIndex = i;
				map.get(array[i]).add(i);

			else // Else add element to hash set
				map.put(array[i],null);
		}
		return minimumIndex;
	}

	public static void main(String[] args) throws java.lang.Exception {
		int array[] = { 10, 7, 8, 1, 8, 7, 6 };
		int min = getFirstRepeatingElementArray(array);
		if (min != -1)
			System.out.println("The first repeating element in array is " + array[min]);
		else
			System.out.println("There are no repeating elements");
	}
}
