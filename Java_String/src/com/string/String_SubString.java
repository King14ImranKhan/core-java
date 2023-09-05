package com.string;

public class String_SubString {
	public static void main(String args[]) {
		String s1 = "javatpoint";
		System.out.println(s1.substring(2, 4));// returns va
		System.out.println(s1.substring(2));// returns vatpoint
		//With single param substring method we provide only begin index.
		//With two param substring method we provide begin index and 
		//end index.
	}
}
