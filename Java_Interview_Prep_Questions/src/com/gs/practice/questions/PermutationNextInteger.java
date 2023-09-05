package com.gs.practice.questions;

import java.util.Arrays;

//Permutation means in how many ways a number can be wrtten
//like 123 can be written as 123,132,213,231,312,321
//Above we have written in dictionary order
//Total permutation of a number will be factorial of number count
// here it will be 3*2*1=6
public class PermutationNextInteger {
	public static int[] swap(int data[], int left, int right) {
		// Swap the data
		int temp = data[left];
		data[left] = data[right];
		data[right] = temp;
		// Return the updated array
		return data;
	}

	public static int[] reverse(int data[], int left, int right) {
		// Reverse the sub-array
		while (left < right) {
			int temp = data[left];
			data[left++] = data[right];
			data[right--] = temp;
		}
		// Return the updated array
		return data;
	}

	public static boolean findNextPermutation(int data[]) {
		if (data.length <= 1)
			return false;
		int last = data.length - 2;
		while (last >= 0) {
			if (data[last] < data[last + 1]) {
				break;
			}
			last--;
		}
		if (last < 0)
			return false;
		int nextGreater = data.length - 1;
		// Find the rightmost successor to the pivot
		for (int i = data.length - 1; i > last; i--) {
			if (data[i] > data[last]) {
				nextGreater = i;
				break;
			}
		}
		data = swap(data, nextGreater, last);
		data = reverse(data, last + 1, data.length - 1);
		return true;
	}

	// Driver Code
	public static void main(String args[]) {
		int data[] = { 1, 2, 3, 7 };
		if (!findNextPermutation(data))
			System.out.println("There is no higher" + " order permutation " + "for the given data.");
		else {
			System.out.println(Arrays.toString(data));
		}
	}
}
