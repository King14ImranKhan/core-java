package com.datastructure;

public class ReverseLinkedList {
	static class Node {
		int data;
		Node next;
		Node(int no) {
			data = no;
			next = null;
		}
	}
	static Node head;
	Node reverse(Node node) {
		Node previous = null;
		Node curr = node;
		Node next = null;
		while (curr != null) {
			next = curr.next;
			curr.next = previous;
			previous = curr;
			curr = next;
		}
		node = previous;
		return node;
	}

	void printList(Node nde) {
		while (nde != null) {
			System.out.print(nde.data + " ");
			nde = nde.next;
		}
	}

	public static void main(String argvs[]) {
		ReverseLinkedList listObj = new ReverseLinkedList();
		listObj.head = new Node(4);
		listObj.head.next = new Node(6);
		listObj.head.next.next = new Node(7);
		listObj.head.next.next.next = new Node(1);
		listObj.head.next.next.next.next = new Node(5);
		listObj.head.next.next.next.next.next = new Node(8);
		listObj.head.next.next.next.next.next.next = new Node(3);
		listObj.head.next.next.next.next.next.next.next = new Node(2);
		System.out.println("The Linked list before reversal is: ");
		listObj.printList(head);
		head = listObj.reverse(head);
		System.out.println("\n");
		System.out.println("After reversal, the linked list is: ");
		listObj.printList(head);
	}

}
