package com.series;

import java.util.Arrays;

public class AnagramJava8 {
	public static void main(String[] args) {
		String str1 = "race";
	    String str2 = "care";
	    String[] obj1 = str1.toLowerCase().split("");
	    String[] obj2 = str2.toLowerCase().split("");
	    String o4 = Arrays.asList(obj1).stream().sorted((o1,o2)->o1.compareTo(o2)).reduce("",(a,b)->a+b);
	    System.out.println("o4 value "+o4);
	    String o5 = Arrays.asList(obj2).stream().sorted((o1,o2)->o1.compareTo(o2)).reduce("",(a,b)->a+b);
	    System.out.println("o5 value "+o5);
	    if(o4.equalsIgnoreCase(o5)) {
	    	System.out.println("It is anagram");
	    }else {
	    	System.out.println("It is not anagram");
	    }
	}
}
