package com.basic.questions;

public class ReverseStringSentence {
	public static void main(String[] args) {
		String s = "hello i am";
		String[] str = s.split(" ");
		String reverse = "";
		for(int i=str.length-1;i>=0;i--) {
			reverse = reverse + str[i]+" ";
		}
		System.out.print(reverse+" ");
	}
}
