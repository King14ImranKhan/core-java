package com.sarika.session.questions;

import java.util.Arrays;
import java.util.stream.Collectors;
//combine two lists
public class ConcatListStrings {
	public static void main(String[] args) {
		String[] obj = {"hello","imran","khan"};
		System.out.println(Arrays.asList(obj).stream().collect(Collectors.joining()));
		System.out.println(Arrays.asList(obj).stream().reduce("",(a,b)->a+b));
	}

}
