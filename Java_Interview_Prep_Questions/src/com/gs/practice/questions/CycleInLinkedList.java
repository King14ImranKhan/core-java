package com.gs.practice.questions;

import java.util.HashSet;
import java.util.Set;

public class CycleInLinkedList {
	
	private static class Node{
		private Object data;
		private Node next;
		public Node(Object data) {
			super();
			this.data=data;
			this.next=null;
		}
	}
	private Node head;
	public void insert(Node newNode) {
		if(isEmpty()) {
			head = newNode;
		}else{
				Node currentNode = head;
				while(currentNode.next != null) {
				currentNode = currentNode.next;
			  }
			currentNode.next = newNode;
		}
	}
	private boolean isEmpty() {
		return head==null;
	}
	
	public void displayLinkedList() {
		Node currentNode = head;
		while(currentNode != null) {
			System.out.print(currentNode.data+"->");
			currentNode = currentNode.next;
		}
	}
	public boolean checkCycleLinkedList1() {
		Node slowReference = head;
		Node fastReference = head;
		while(slowReference != null && fastReference != null && fastReference.next != null) {
			fastReference = fastReference.next.next;
			slowReference = slowReference.next;
			if(slowReference == fastReference ) {
				return true;
			}
		}
		return false;
	}
	
	public boolean checkCycleLinkedList2() {
		Set<Node> set = new HashSet<>();
		Node currentNode = head;
		while(currentNode != null) {
			if(!set.add(currentNode)) {
				return true;
			}
		}
		return false;
	}
	
	
	public static void main(String[] args) {
		Node node = new Node(10);
		CycleInLinkedList linkedList = new CycleInLinkedList();
		linkedList.insert(new Node(20));
		linkedList.insert(new Node(30));
		linkedList.insert(node);
		linkedList.insert(new Node(40));
		linkedList.insert(new Node(50));
		linkedList.insert(node);
		//linkedList.displayLinkedList();
		boolean checkCycleLinkedList1 = linkedList.checkCycleLinkedList1();
		System.out.println("Cycle Linked List 1 = "+checkCycleLinkedList1);
		boolean checkCycleLinkedList2 = linkedList.checkCycleLinkedList2();
		System.out.println("Cycle Linked List 2 = "+checkCycleLinkedList2);
	}
}
