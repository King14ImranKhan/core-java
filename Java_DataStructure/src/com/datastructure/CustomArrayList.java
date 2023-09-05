package com.datastructure;
class ArrayList{
	Object[] arr;
	int s;
	int capacity;
	ArrayList(){
		capacity=10;
		s=0;
		arr = new Object[capacity];
	}
	void add(Object item) {
		arr[s++]=item;
	}
	Object get(int index) {
		return arr[index];
	}
	int size() {
		return s;
	}
}
public class CustomArrayList {
	public static void main(String[] args) {
		ArrayList l = new ArrayList();
		l.add(1);
		l.add(2);
		l.add("string");
		l.add(null);
		l.add('c');
		for(int i=0;i<l.size();i++) {
			System.out.println(l.get(i));
		}
		
	}
}
