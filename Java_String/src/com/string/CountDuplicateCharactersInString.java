package com.string;

public class CountDuplicateCharactersInString {
	public static void main(String[] args) {
		int count=0;
		String str = "aristocrat";
		char[] array = str.toCharArray();
		for(char s:array) {
				for(int l=0;l<=array.length-1;l++) {
					if(s==str.charAt(l)) {
						count=count+1;
					}
				}
				System.out.println(s+": count:"+count);
				count=0;
		}
	}
}
