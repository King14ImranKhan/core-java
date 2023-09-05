package com.basic.questions;
import java.util.HashSet;
public class FirstRecurringElement {
	static int getFirstRepeatingElementArray(int array[]) {
		int minimumIndex = -1;
		HashSet<Integer> set = new HashSet<>();
		for (int i = array.length - 1; i >= 0; i--) {
			if (set.contains(array[i]))
				minimumIndex = i;

			else // Else add element to hash set
				set.add(array[i]);
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
