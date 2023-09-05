package com.java8;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class StreamAPI {
	public static void main(String[] args) {
	List<Integer> integer = Arrays.asList(4,2,3,7,6,9);
	List<Integer> o =integer.stream().filter(i->i%2==0).collect(Collectors.toList());
	System.out.println(o);
}
}