package com.dsa.recursion.strings;

public class PalindromeNumber {
    public static void main(String[] args) {
        int num = 122;
        int rev = reverse(num, 0);
        System.out.println(num == rev);
    }

    private static int reverse(int num, int temp) {
        if (num == 0) {
            return temp;
        }
        temp = (temp * 10) + (num % 10);
        return reverse(num / 10, temp);
    }
}
