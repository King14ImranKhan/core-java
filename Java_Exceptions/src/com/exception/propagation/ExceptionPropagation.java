package com.exception.propagation;
/* m() method is getting called from n() method.And if m() method is throwing
 * an exception which is not handled inside m1() method then that exception 
 * will get propagated to caller n() method.So now caller n() method is 
 * responsible to handle the exception.This whole process is called Exception
 *  Propagation.
 */

public class ExceptionPropagation {
	void m() {
		int data = 50 / 0;
	}

	void n() {
		m();
	}

	void p() {
		try {
			n();
		} catch (Exception e) {
			System.out.println("exception handled");
		}
	}

	public static void main(String args[]) {
		ExceptionPropagation obj = new ExceptionPropagation();
		obj.p();
		System.out.println("normal flow...");
	}
}
