package com.basic.questions;

public class PrimeNumber {
	public static void main(String[] args) {
		for(int i=1;i<=100;i++)
		{
			int counter=0;
			for(int j=i;j>=1;j--) {
				if(i%j==0)
				{
					counter=counter+1;
				}
			}
			if(counter==2) {
				System.out.println(i);
			}
		}
		
		for(int j=1;j<=200;j++) {
			int count=0;
			for(int k=j;k>=1;k--) {
				if(j%k==0) {
					count=count+1;
				}
			}
			if(count==2) {
				System.out.println("Prime Number "+j);
			}
		}
	}
}
	


