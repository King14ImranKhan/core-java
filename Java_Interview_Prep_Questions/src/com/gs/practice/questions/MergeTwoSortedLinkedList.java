package com.gs.practice.questions;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

class Node {
	int data;
	Node next;
	public Node(int data) {
		this.data = data;
		next = null;
	}
}
public class MergeTwoSortedLinkedList {
	// return a newnode
	public static Node newNode(int key) {
		return new Node(key);
	}
	// driver code
	public static void main(String[] args) {
		// let us create two sorted linked lists to test the above
		// function. Created lists shall be
		// a: 5->10->15->40
		// b: 2->3->20
		Node node1 = new Node(5);
		node1.next = new Node(10);
		node1.next.next = new Node(15);
		node1.next.next.next = new Node(40);

		Node node2 = new Node(2);
		node2.next = new Node(3);
		node2.next.next = new Node(20);

		List<Integer> list = new ArrayList<>();
		while (node1 != null) {
			list.add(node1.data);
			node1 = node1.next;
		}

		while (node2 != null) {
			list.add(node2.data);
			node2 = node2.next;
		}

		Collections.sort(list);
		Node result = new Node(-1);
		Node temp = result;
		for (int i = 0; i < list.size(); i++) {
			result.next = new Node(list.get(i));
			result = result.next;
		}

		temp = temp.next;
		System.out.print("Resultant Merge Linked List is : ");
		while (temp != null) {
			System.out.print(temp.data + " ");
			temp = temp.next;
		}
	}
}