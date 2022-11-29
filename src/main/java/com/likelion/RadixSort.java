package com.likelion;

import java.util.Arrays;

public class RadixSort {
    public static int[] radixSort(){
        int[] arr = {7, 4, 5, 9, 1, 0};
        int[] memo = new int[10];

        for (int i : arr) {
            memo[i] = i;
        }
        System.out.println(Arrays.toString(arr));
        System.out.println(Arrays.toString(memo));
        return memo;
    }
    public static void main(String[] args) {
        radixSort();
    }
}
