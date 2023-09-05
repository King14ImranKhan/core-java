package com.sarika.session.questions;

import java.util.Arrays;
import java.util.stream.Collectors;

public class SumOfAllEvenNumbers {
	public static void main(String[] args) {
		Integer[] i = {2,1,4,5,6,2};
		System.out.println(Arrays.asList(i).stream().filter(e->e%2==0).collect(Collectors.summarizingInt(e->e)).getSum());
		System.out.println(Arrays.asList(i).stream().filter(e->e%2==0).reduce(0, (a,b)->a+b).intValue());
	}
}
