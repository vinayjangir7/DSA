package com.dsa.sorting.basic;

public class Selection {

    public static void sort(int[] arr) {
        // Iterate through the array from the first element to the second-to-last element.
        for (int i = 0; i < arr.length - 1; i++) {
            // Set the minimum element index to the current iteration's index.
            int minIndex = i;
            // Iterate through the remaining unsorted portion of the array starting from the element after the current iteration.
            for (int j = i + 1; j < arr.length; j++) {
                // If the element at the current index is less than the current minimum element, update the minimum index.
                if (arr[j] < arr[minIndex]) {
                    minIndex = j;
                }
            }
            // Swap the current iteration's element with the minimum element in the remaining unsorted portion of the array.
            swap(arr, i, minIndex);
        }
    }

    private static void swap(int[] arr, int index1, int index2){
        int temp = arr[index1];
        arr[index1] = arr[index2];
        arr[index2] = temp;
    }
}
