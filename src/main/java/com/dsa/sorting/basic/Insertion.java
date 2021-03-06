package com.dsa.sorting.basic;

public class Insertion {

    public static void sort(int[] arr) {
        for (int i = 1; i < arr.length; i++) {
            int key = arr[i];
            int j = i - 1;
            while (j >= 0 && key < arr[j]) {
                arr[j + 1] = arr[j];
                j--;
            }
            // placement
            arr[j + 1] = key;
        }
    }
}
