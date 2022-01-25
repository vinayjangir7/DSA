package com.dsa.sorting.advanced;

public class Quick {

    public static void sort(int[] arr, int low, int high) {
        if (low < high) {
            int pivotIndex = partition(arr, low, high);
            sort(arr, low, pivotIndex - 1);
            sort(arr, pivotIndex + 1, high);
        }
    }

    public static int partition(int[] arr, int low, int high) {
        int pivot = arr[high];
        // To track position to fill, and the current value will be -1 as there are no elements to fill
        int i = low - 1;

        for (int j = low; j < high; j++) {
            if (arr[j] < pivot) {
                // Increment i here to provide a place to put number < pivot
                i++;
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }
        // Increase i to put pivot element here as all the small numbers are placed by upper loop till i index
        i++;
        int temp = arr[i];
        arr[i] = pivot;
        arr[high] = temp; // arr[high] == pivot
        return i; // pivot index
    }
}
