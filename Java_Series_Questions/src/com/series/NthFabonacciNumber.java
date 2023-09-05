package com.series;

public class NthFabonacciNumber {
	static int fib(int n)
    {
        int n1 = 0, n2 = 1, n3;
        if (n == 0) {
            return n1;
        }
        for (int i = 2; i <= n; i++) {
            n3 = n1 + n2;
            n1 = n2;
            n2 = n3;
        }
        return n2;
    }
    public static void main(String args[])
    {
        int n = 9;
        System.out.println(fib(n));
    }
}
