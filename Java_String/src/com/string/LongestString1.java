package com.string;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;

public class LongestString1 {
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
        
      Optional<String> value=  names.stream().sorted((o1,o2)->Integer.valueOf(o2.length()).compareTo(o1.length())).findFirst();
	  System.out.println("hello  "+value.get());
	}
}
