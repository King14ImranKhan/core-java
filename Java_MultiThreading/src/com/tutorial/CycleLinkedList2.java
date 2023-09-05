package com.tutorial;

import java.util.HashSet;
import java.util.LinkedList;
import java.util.Set;

public class CycleLinkedList2 {
	public static void main(String[] args) {
		LinkedList<Integer> list = new LinkedList<>();
		Set<Integer> set = new HashSet<>();
		list.add(4);
		list.add(5);
		list.add(7);
		list.add(4);
		list.add(8);
		for (int i = 0; i < list.size(); i++) {
			if (set.contains(list.get(i))) {
				System.out.println("Cycle in Linked List");
			} else {
				set.add(list.get(i));
			}

		}
	}
}
