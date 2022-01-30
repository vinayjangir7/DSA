package com.dsa.sorting;

import com.dsa.sorting.basic.Selection;

import java.time.LocalDateTime;
import java.util.Arrays;
import java.util.stream.IntStream;

public class SortingApp {
    public static void main(String[] args) {
        int[] arr = IntStream.range(1, 10).map(n -> 1 + (10 - 1 - n)).toArray();
        /*int[] arr = {5, 6, 3, 8, 2, 9};*/
        System.out.println(LocalDateTime.now().toLocalTime());

        Selection.sort(arr);
        /*Quick.sort(arr, 0, arr.length - 1);*/
        System.out.println(LocalDateTime.now().toLocalTime());
        System.out.println(Arrays.toString(arr));
    }
}
