package com.dsa.numbers;

public class Fibonacci {
    public static int getNthFibonacciNumber(int n) {
        int[] dp = new int[n + 1];
        if (n <= 1) {
            return n;
        }
        if (dp[n] != 0) {
            return dp[n];
        }

        dp[n] = getNthFibonacciNumber(n - 1) + getNthFibonacciNumber(n - 2);
        return dp[n];
    }

    public static void main(String[] args) {
        int n = 1000;
        System.out.println(getNthFibonacciNumber(n));
    }
}
