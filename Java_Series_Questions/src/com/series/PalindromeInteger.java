package com.series;
/*a number that is equal to the reverse of that same number is called a
 *  palindrome number. For example, 3553, 12321, etc.
 */
public class PalindromeInteger {
	public static void main(String[] args) {
		int number = 3553, reversedNumber = 0, remainder;
		int originalNumber = number;
		while (number != 0) {
			remainder = number % 10;
			reversedNumber = reversedNumber * 10 + remainder;
			number = number/10;
		}
		if (originalNumber == reversedNumber) {
			System.out.println(originalNumber + " is Palindrome.");
		} else {
			System.out.println(originalNumber + " is not Palindrome.");
		}
	}
}
