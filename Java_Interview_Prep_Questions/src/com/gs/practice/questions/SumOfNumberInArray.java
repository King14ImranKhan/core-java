package com.gs.practice.questions;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.stream.Collectors;

public class SumOfNumberInArray {
	public static void main(String[] args) {
		
	Integer[] arr = {2,4,6,8,1,10};
	Map<Integer,Integer> map = new HashMap<>();
	Arrays.asList(arr).stream().filter(e->{
		for(int i=1;i<arr.length-1;i++) {
			if(e+arr[i]==14) {
				map.put(e, arr[i]);
				return true;
			}
		}
		return false;
	}).collect(Collectors.toList());
	map.entrySet().stream().collect(Collectors.toMap(k->k.getKey(), v->v.getValue())).forEach((k,v)->System.out.println(k+","+v));
	}}
