package com.java8;
import java.io.FileNotFoundException;
import java.util.Arrays;
import java.util.List;

public class ForEach {
	public static void main(String[] args) throws FileNotFoundException {
		
		List<Integer> integer = Arrays.asList(4,2,3,7,6,9);
		 integer.stream().forEach(i->System.out.println(i));
	}
}
