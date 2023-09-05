package com.gs.practice.questions;

public class ReverseLinkedList {
	static class Node {
		Object data;
		Node next;
		Node(int data) {
			this.data = data;
			this.next = null;
		}
	}
	static Node head;
	Node reverse(Node node) {
		Node previous = null;
		Node current = node;
		Node next = null;
		while (current != null) {
			next = current.next;
			current.next = previous;
			previous = current;
			current = next;
		}
		node = previous;
		return node;
	}

	void printList(Node node) {
		while (node != null) {
			System.out.print(node.data + " ");
			node = node.next;
		}
	}

	public static void main(String argvs[]) {
		ReverseLinkedList.head = new Node(4);
		ReverseLinkedList.head.next = new Node(6);
		ReverseLinkedList.head.next.next = new Node(7);
		ReverseLinkedList.head.next.next.next = new Node(1);
		ReverseLinkedList.head.next.next.next.next = new Node(5);
		ReverseLinkedList.head.next.next.next.next.next = new Node(8);
		ReverseLinkedList.head.next.next.next.next.next.next = new Node(3);
		ReverseLinkedList.head.next.next.next.next.next.next.next = new Node(2);
		ReverseLinkedList list = new ReverseLinkedList();
		System.out.println("The Linked list before reversal is: ");
		list.printList(head);
		head = list.reverse(head);
		System.out.println("\n");
		System.out.println("After reversal, the linked list is: ");
		list.printList(head);
	}

}
