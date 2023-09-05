package com.hackerrandquestions;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

class PrintString{
	static void getValue(String value,int start,int end) {
		List<String> k=new ArrayList<>(); 
		for(int i=start;i<=end;i++) {
			System.out.println(value.charAt(i));
		}
	}
}

public class IndicesFinder {
	public static void main(String[] args) {
		Scanner obj = new Scanner(System.in);
		System.out.println("Enter String");
		String str = obj.next();
		System.out.println("Enter Start");
		Integer start = obj.nextInt();
		System.out.println("Enter End");
		Integer end = obj.nextInt();
		PrintString.getValue(str, start, end);
		System.out.println(str.substring(0, 2));
		
		
	}

}
