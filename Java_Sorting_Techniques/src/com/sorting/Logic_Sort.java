package com.sorting;

import java.util.ArrayList;
import java.util.List;

class Sort{
	public void f1(int[] k) {
		int temp;
		for(int i=0;i<k.length;i++) {
			for(int j=i+1;j<k.length;j++) {
				if(k[i]>k[j]) {
					temp=k[i];
					k[i]=k[j];
					k[j]=temp;
				}
			}
		}
		for(int i=0;i<k.length;i++) {
			System.out.print(k[i]+" ");
		}
		
		
		
	}
}

public class Logic_Sort {
	public static void main(String[] args) {
		int[] i = {67,54,34,1,4};
		Sort sort = new Sort();
		sort.f1(i);
		
	}

}
