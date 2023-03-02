package com.dsa.sorting.basic;

public class Insertion {

    public static void sort(int[] arr) {
        for (int i = 1; i < arr.length; i++) {
            // Save the current value to be sorted in the variable 'key'.
            int key = arr[i];

            // Set a counter 'j' to the index of the element before the current element.
            int j = i - 1;

            // While 'j' is greater than or equal to 0 and the value at index 'j' is greater than the 'key' value...
            while (j >= 0 && key < arr[j]) {
                // ...move the element at index 'j' one position to the right.
                arr[j + 1] = arr[j];
                // Decrement 'j' to continue comparing the 'key' value to previous elements.
                j--;
            }

            // Insert the 'key' value in the correct position in the sorted subarray.
            arr[j + 1] = key;
        }
    }

}
