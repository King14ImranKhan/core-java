package com.sarika.session.questions;

import java.util.Arrays;
import java.util.stream.Collectors;

public class CountNumberOfSpecialCharacterString {
	 static int count=0;
	public static void main(String[] args) {
		String[] str = {"imran","aman","salman","imu","imrankhan"};
		System.out.println((Arrays.asList(str).stream().filter(e->{
			if(e.charAt(0)=='i') {
				count=count+1;
				return true;
			}
			return false;
		})).collect(Collectors.counting()));
	}
}
