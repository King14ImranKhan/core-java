package com.string;

import java.util.ArrayList;
import java.util.List;

public class Recur {
	public static void main(String[] args) {
		String s ="mohammadd";
		String[] str = s.split("");
		List<String> list = new ArrayList<>();
		for(int i=0;i<str.length-1;i++) {
			if(str[i].equalsIgnoreCase(str[i+1])) {
				list.add(str[i]);
			}
		}
		String  o=list.stream().findFirst().get();
		System.out.println(o);
	}
}
