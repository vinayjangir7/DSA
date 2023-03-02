package com.dsa.numbers;

import java.math.BigInteger;

public class FibonacciOptimized {
    public static void main(String[] args) {
        int n = 1000;
        long fibN = fibonacci(n);
        System.out.println("Fibonacci(" + n + ") = " + fibN);
    }

    // Iterative function to compute the nth Fibonacci number
    public static long fibonacci(int n) {
        long a = 0, b = 1;
        for (int i = 2; i <= n; i++) {
            long temp = b;
            b = a + b;
            a = temp;
        }
        return n > 0 ? b : a;
    }
}
