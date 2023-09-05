package com.basic.questions;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class LongestStringJava8 {
	public static void main(String[] args) {
        List<String> names = Arrays.asList(
                "Bond",
                "Einstein",
                "Alice",
                "Whitman",
                "Bob",
                "Spider"
                );
        System.out.println("Original String List :- \n" + names);
        String longestString = names
                .stream()
                .max(Comparator.comparingInt(String::length))
                .get();
        System.out.println("\nLongest String is = "
                + longestString);
        int lengthOflongestString = names
                .stream()
                .map(String::length)
                .max(Integer::compare)
                .get();
        System.out.println("\nLength of Longest String is = "
                + lengthOflongestString);
	}
}
