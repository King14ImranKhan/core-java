package com.java8;

interface Parser {
	String parse(String str);
}

class StringParser {
	public static String convert(String s) {
		if (s.length() <= 3)
			s = s.toLowerCase();
		else
			s = s.toUpperCase();
		return s;
	}
}
class MyPrinter {
	public void print(String str, Parser p) {
		str=p.parse(str);
		System.out.println(str);
	}
}
public class MethodReference1 {
	public static void main(String[] args) {
		String str = "imran khan";
		MyPrinter obj = new MyPrinter();
		obj.print(str, StringParser::convert);

	}
}
