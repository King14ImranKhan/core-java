package com.gs.practice.questions;

public class CheckPrime {
	public static void main(String[] args) {
		int n=9,count = 0;
		for(int i=1;i<=n;i++) {
			if(n%i==0) {
				count=count+1;
			}
		}
		if(count==2) {
			System.out.println("Prime");
		}else {
			System.out.println("Not Prime");
		}
	}
}
