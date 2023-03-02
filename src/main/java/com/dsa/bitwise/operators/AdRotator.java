package com.dsa.bitwise.operators;

public class AdRotator {

    public static int bitwiseComplement(int num) {
        // Convert num to binary string
        if (num == 0) {
            return 1;
        }

        // Find the highest bit that is set
        int highestBit = 0;
        int mask = num;
        while (mask != 0) {
            highestBit++;
            mask = mask >> 1;
        }

        // Create a mask that has all bits up to highest bit set to 1
        int mask2 = (1 << highestBit) - 1;

        // XOR num with the mask to get the complement
        return num ^ mask2;
    }

    public static void main(String[] args) {
        int num = 50; // Example input
        int complement = bitwiseComplement(num);
        System.out.println(complement); // Output: 65535
    }
}