package com.hackerrandquestions;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

// Take an Arraylist of int as input example [1,2,2,1,3,4,3] and [1,1,2,2,3,3,4] must be actual array of [1,2,2,1,3,4,3] int this
// case 1,3,4 are misplaced write the code to get count misplaced element in above case the count is 4.

public class ArraylistQuestion {
	public static void main(String[] args) {
		List<Integer> list1 = Arrays.asList(new Integer[] { 1, 2, 2, 1, 3, 4, 3 });
		getCount(list1);
	}
	public static int getCount(List<Integer> list) {
		 Object[] tempList = list.toArray();
		Collections.sort(list);
		System.out.println("list>>" + list);
		int count = 0;
		for (int i = 0; i < list.size(); i++) {
			if (((Integer) tempList[i]) != list.get(i))
				count++;

		}
		return count;
	}

}
