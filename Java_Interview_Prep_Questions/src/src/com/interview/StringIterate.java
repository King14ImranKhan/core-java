package src.com.interview;

import java.util.Arrays;
import java.util.List;

public class StringIterate {
	public static void main(String[] args) {
		String str = "argumentation";
		char[] character = str.toCharArray();
		List<char[]> d = Arrays.asList(character);
		System.out.println("hii"+d);
		/*
		 * for(char a : character) { System.out.println(a); }
		 */
		d.stream().sorted().forEach(System.out::println);
	}

}
