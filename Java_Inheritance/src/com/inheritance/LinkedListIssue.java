package com.inheritance;
import java.util.LinkedList;
import java.util.List;
public class LinkedListIssue {
	public static void main(String[] args) {
		List<Integer> list = new LinkedList<>();
		list.add(4);
		list.add(9);
		list.add(78);
		list.add(45);
		System.out.println(list.get(2));
	}
}
