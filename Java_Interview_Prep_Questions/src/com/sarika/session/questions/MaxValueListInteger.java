package com.sarika.session.questions;

import java.util.Arrays;

public class MaxValueListInteger {
	public static void main(String[] args) {
		Integer[] obj = {9,4,3,1,0,10,11,11};
		System.out.println(Arrays.asList(obj).stream().sorted((o1,o2)->o2.compareTo(o1)).findFirst());
	}
}
