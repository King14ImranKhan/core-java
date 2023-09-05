package com.sarika.session.questions;

import java.util.Arrays;

public class LongestStringInList {

	public static void main(String[] args) {
		String[] str = {"imran","imrankhan","mdimrankhan"};
		System.out.println(
		Arrays.asList(str).stream().reduce((x, y) -> x.length() > y.length() ? x : y)
        .get());
		
	}
}
