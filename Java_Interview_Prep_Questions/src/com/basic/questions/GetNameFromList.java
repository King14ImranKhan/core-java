package com.basic.questions;
import java.util.Arrays;
import java.util.List;

public class GetNameFromList {
	public static void main(String[] args) {
		List<String> list = Arrays.asList("Sita","Ram");
		System.out.println(list.stream().filter(i->i=="Sita"));
	}
}
