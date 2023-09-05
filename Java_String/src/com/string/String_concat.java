package com.string;
/*String has concat method, remember string is immutable.
It adds a string to another string.
It will create the new object after concatenation done, since it is a
 immutable.*/
public class String_concat {
	public static void main(String[] args) {
		// Concatenating string with another string
		String helloVariable = "hello ";
		String worldVariable = "world";
		System.out.println(helloVariable.concat(worldVariable)); // hello world
	}
}
