package com.gs.practice.questions;

class Nodes {
	int data;
	Nodes next;

	// constructor of the class Node
	Nodes(int data) {
		this.data = data;
		this.next = null;
	}
}

public class MiddleElementOfLinkedList {
	public void findNode(Nodes n) {
		if (n == null) {
			return;
		}
		Nodes slow = n;
		Nodes fast = n;
		while (fast != null && fast.next != null) {
			// fast pointer is taking two steps at a time
			fast = fast.next.next;
			// slow pointer is taking one step at a time
			slow = slow.next;
		}
		System.out.println("The middle node of the linked list is: " + slow.data);
	}

	// main method
	public static void main(String argvs[]) {
		// head node of the linked list
		Nodes h = new Nodes(13);
		// remaining node of the linked list
		h.next = new Nodes(17);
		h.next.next = new Nodes(90);
		h.next.next.next = new Nodes(76);
		h.next.next.next.next = new Nodes(45);
		h.next.next.next.next.next = new Nodes(32);
		h.next.next.next.next.next.next = new Nodes(10);
		// creating an object of the class TwoPointerExample1
		MiddleElementOfLinkedList obj = new MiddleElementOfLinkedList();
		// invoking the method findNode()
		obj.findNode(h);
	}
}
