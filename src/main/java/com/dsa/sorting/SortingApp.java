package com.dsa.sorting;

import com.dsa.sorting.advanced.Merge;
import com.dsa.sorting.advanced.Quick;
import com.dsa.sorting.basic.Insertion;
import com.dsa.sorting.basic.Selection;

import java.time.LocalDateTime;
import java.util.Arrays;
import java.util.stream.IntStream;

public class SortingApp {
    public static void main(String[] args) {
        /*int[] arr = IntStream.range(1, 10).map(n -> 1 + (10 - 1 - n)).toArray();*/
        int[] arr = {2, 5, 1, 3, 6, 4};
        System.out.println(LocalDateTime.now().toLocalTime());
        System.out.println(Arrays.toString(arr));

        /*Selection.sort(arr);*/
        Selection.sort(arr);
        System.out.println(LocalDateTime.now().toLocalTime());
        System.out.println(Arrays.toString(arr));
    }
}
