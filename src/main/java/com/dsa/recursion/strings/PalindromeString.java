package com.dsa.recursion.strings;

public class PalindromeString {

    public static void main(String[] args) {
        String str = "abcdedcba";
        int start = 0;
        int end = str.length() - 1;
        System.out.println(checkPalindrome(str, start, end));
    }

    private static boolean checkPalindrome(String str, int start, int end) {
        if (str.length() == 1 || str.length() == 0) {
            return true;
        }
        if (str.charAt(start) != str.charAt(end)) {
            return false;
        }
        if (start <= end) {
            return checkPalindrome(str, ++start, --end);
        }

        return true;
    }
}
