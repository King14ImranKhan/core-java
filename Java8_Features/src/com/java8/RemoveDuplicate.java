package com.java8;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

interface S1{
	static boolean sqrt(int n) {
		for(int i=0;i<=n;i++) {
			if(i*i==n) {
				return true;
			}
		}
		return false;
	}
	
}
public class RemoveDuplicate {
	public static void main(String[] args) {
		Integer[] arr = {3,4,4,5,6,6,9};
		Set<Integer> set = new HashSet<>();
		//Arrays.asList(arr).stream().filter(e->set.add(e)).forEach(i->System.out.print(i));
		System.out.println();
		Arrays.asList(arr).stream().filter(e->set.add(e)).forEach(i->System.out.print(i));
		System.out.println();
		Arrays.asList(arr).stream().filter(e->S1.sqrt(e)).forEach(j->System.out.print(j));;
	}
}
