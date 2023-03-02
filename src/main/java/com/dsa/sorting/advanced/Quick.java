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
                // Increment i here to provide a place to put number less than pivot
                i++;
                swap(arr, i, j);
            }
        }
        // Increase i to put pivot element here as all the small numbers are placed by upper loop till i index
        i++;
        swap(arr, i, high);
        return i; // pivot index
    }

    private static void swap(int[] arr, int index1, int index2){
        int temp = arr[index1];
        arr[index1] = arr[index2];
        arr[index2] = temp;
    }
}
