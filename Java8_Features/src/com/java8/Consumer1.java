package com.java8;

import java.util.Arrays;
import java.util.function.Consumer;

class ConsumerExample implements Consumer<Integer>{
	@Override
	public void accept(Integer t) {
		System.out.println(t);
	}
}
public class Consumer1 {
	public static void main(String[] args) {
		java.util.List<Integer> values = Arrays.asList(6, 3, 5, 7, 2);
		values.forEach(i -> System.out.println(i));
		Consumer<Integer> obj= new ConsumerExample();
		values.forEach(obj);
		
		Consumer<Integer> obj2 = new Consumer<Integer>() {
			public void accept(Integer i) {
				System.out.println(i);
			}
		};
		values.forEach(obj2);
	}
}
