package com.rethrowing.exception;
/* Converting one exception type to another exception type. It is called
 * Re-throwing Exception.
 * In below example we have converted Arithmetic Exception to
 * NullPointerException in catch block.
 */
public class RethrowingException {
	public static void main(String[] args) {
		try {
			int data = 50/0;
		}catch(ArithmeticException ex) {
			throw new NullPointerException();
		}
	}
}
