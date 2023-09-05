package com.search.techniques;
class BinarySearch {
	private static int binarySearch(int arr[], int num) {
		int low = 0;
		int high = arr.length - 1;
		while (low <= high) {
			int middleIndex = (low + high) / 2;
			int middleIndexNumber = arr[middleIndex];

			if (num == middleIndexNumber) {
				return middleIndex;
			}
			if (num < middleIndexNumber) {
				high = middleIndex - 1;
			}
			if (num > middleIndexNumber) {
				low = middleIndex + 1;
			}
		}
		return -1;
	}
	public static void main(String args[]) {
		int[] arr = { 2, 3, 6, 8, 9, 13, 20 };
		System.out.println(binarySearch(arr, 13));
	}
}
