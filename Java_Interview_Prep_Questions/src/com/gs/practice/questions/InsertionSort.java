package com.gs.practice.questions;

public class InsertionSort {
	public static void insertionSort(int array[]) {
		for (int i = 1; i < array.length; i++) {
			int temp = array[i];
			int j = i - 1;
			while ((j >= 0) && (array[j] > temp)) {
				array[j + 1] = array[j];
				j--;
			}
			array[j + 1] = temp;
		}
	}

	public static void main(String a[]) {
		int[] arr1 = { 9, 14, 3, 2, 43, 11, 58, 22 };
		System.out.println("Before Insertion Sort");
		for (int i : arr1) {
			System.out.print(i + " ");
		}
		System.out.println();
		insertionSort(arr1);// sorting array using insertion sort
		System.out.println("After Insertion Sort");
		for (int i : arr1) {
			System.out.print(i + " ");
		}
	}
}
