package com.gs.practice.questions;
/* What is subarray?
 * A subarray is an array that is inside another array. It should be
 * contagious(means continuous element in array). 
 */
public class MaxSubArraySum {
	public static int findMaxSubArraySum(int[] arr) {
		int maxSum = arr[0];
		int sum = arr[0];
		for(int i=1;i<arr.length;i++) {
			if(sum < 0) {
				sum = arr[i];
			}else {
				sum = sum + arr[i];
			}
			maxSum = Math.max(sum, maxSum);
		}
		return maxSum;
	}
	public static void main(String[] args) {
		int[] arr = {1,2,-5,4,3,8,5};
		int result = findMaxSubArraySum(arr);
		System.out.println(result);
	}
}
