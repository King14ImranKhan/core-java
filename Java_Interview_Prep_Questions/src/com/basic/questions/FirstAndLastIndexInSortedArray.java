package com.basic.questions;

public class FirstAndLastIndexInSortedArray {
	public static void main(String[] args) {
		int[] arr = {2,3,4,8,9,10};
		int search = 4;
		int firstIndex = -1;
		int lastIndex = -1;
		for(int i=0;i<=arr.length-1;i++) {
			if(arr[i]==search && firstIndex == -1) {
				firstIndex = i;
				System.out.println(firstIndex);
			}
			if(arr[i]==search && firstIndex != -1) {
				lastIndex = i;
				System.out.println(lastIndex);
			}
		}
	}
}
