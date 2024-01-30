package com.multithreading.secondClass;

public class AlphaNumeric {
	synchronized void printD() {
		for (int i = 1; i < 26; i++) {
			System.out.println(i);
			notify();
			try {
				wait();
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
	
	synchronized void printC() {
		for(int i=65;i<=97;i++) {
			
		}
	}
}
