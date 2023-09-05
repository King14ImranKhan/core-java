package com.gs.practice.questions;

import java.util.ArrayList;
import java.util.List;

public class SecondMostRecurringElementInString {
	public static void main(String[] args) {
		String s = "mohammadEmployeezz";
		String s1 = "mohammadEmployeezz";
		char j = 'f';
		char d = 'f';
		if(j==d) {
			System.out.println(true);
		}
		if(s == s1) {
			System.out.println(true);
		}
		char[] c = s.toCharArray();
		List<Character> list = new ArrayList<>();
		for(int i=0;i<s.length()-1;i++) {
			if(c[i]==c[i+1] && c[i]!=c[i-1]) {
				list.add(c[i]);
			}
		}
		System.out.println(list.get(1));
	}
	
}
