package com.gs.practice.questions;

class Entry{
	String name;
	Integer marks;
	public Entry(String name, Integer marks) {
		super();
		this.name = name;
		this.marks = marks;
	}
	
}
public class MultipleDimensionalArray {
	public static void main(String[] args) {
		Entry[] obj = new Entry[10];
		new Entry("Ram", 50);
		new Entry("Rahul", 70);
		new Entry("sam", 60);
		new Entry("Tom", 90);
		new Entry("Amol", 80);
		
		for(int i=0;i<obj.length;i++) {
			for(int j=0;j<obj.length;j++) {
				
			}
		}
		
		
	}
}
