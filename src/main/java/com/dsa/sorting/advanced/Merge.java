package com.dsa.sorting.advanced;

public class Merge {

    // Method to sort an array of integers using the Merge Sort algorithm
    public static void sort(int[] arr, int left, int right) {
        // Base case to check if there is more than one element in the subarray
        if (left < right) {
            // Calculate the middle index of the subarray
            int middle = left + (right - left) / 2;
            // Recursively sort the left and right halves of the subarray
            sort(arr, left, middle);
            sort(arr, middle + 1, right);
            // Merge the sorted halves of the subarray back together
            merge(arr, left, middle, right);
        }
    }

    // Method to merge two sorted subarrays into a single sorted subarray
    public static void merge(int[] arr, int left, int middle, int right) {
        // Create a temporary array to hold the merged subarray
        int[] temp = new int[right - left + 1];
        // Initialize pointers for the left subarray, right subarray, and temporary array
        int i = left;
        int j = middle + 1;
        int k = 0;

        // Merge the left and right subarrays by comparing their elements
        while (i <= middle && j <= right) {
            if (arr[i] <= arr[j]) {
                temp[k++] = arr[i++];
            } else {
                temp[k++] = arr[j++];
            }
        }

        // Copy any remaining elements in the left subarray to the temporary array
        while (i <= middle) {
            temp[k++] = arr[i++];
        }

        // Copy any remaining elements in the right subarray to the temporary array
        while (j <= right) {
            temp[k++] = arr[j++];
        }

        // Copy the merged subarray back to the original array
        for (int x = 0, y = left; x < temp.length; x++, y++) {
            arr[y] = temp[x];
        }
    }
}
