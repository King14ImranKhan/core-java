package com.hackerrandquestions;

public class MCQ1 {
	public static void main(String[] args) {
		MCQ1 obj = new MCQ1();
		System.out.println(obj.test());
	}
	public String test() {
		try {
			String e ="imran";
			return e;
		}catch(Exception e) {
			return "khan";
		}finally {
			return "imrankhan";
		}
	}
}
//Yes, it will. No matter what happens in your try or catch block unless otherwise System. exit() called or JVM 
//crashed. if there is any return statement in the block(s),finally will be executed prior to that return statement.
