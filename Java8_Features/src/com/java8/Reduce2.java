package com.java8;

import java.util.Arrays;
import java.util.Optional;

public class Reduce2 {
	public static void main(String[] args) {
		String[] s = {"imran","rahulg","lllllllllllllllll","imrankhan","asd"};
		//Java -8
		Optional<String> d=Arrays.asList(s).stream().reduce((a,b)->a.length()>b.length()?a:b);
		System.out.println(d);
		//Java-7
		for(int i=0;i<s.length;i++) {
			String temp=null;;
			for(int j=i+1;j<s.length;j++) {
				if(s[i].length()>s[j].length()) {
					temp=s[i];
					s[i]=s[j];
					s[j]=temp;
				}
			}
		}
		System.out.println(s[s.length-1]);
	}
}
