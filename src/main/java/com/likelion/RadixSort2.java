package com.likelion;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class RadixSort2 {
    public static Set<Integer> digit(int[] numbers){
        Set<Integer> digitArr = new HashSet<>();
        for (int number : numbers) {
            if (number==0){
                digitArr.add(1);
            }else{
                digitArr.add((int)(Math.log10(number)+1));
            }
        }
        return digitArr;
    }

    public static int[] radixSort(int arr[]){
        int[] memo = new int[10];

        for (int i : arr) {
            memo[i] = i;
        }
        System.out.println(Arrays.toString(arr));
        System.out.println(Arrays.toString(memo));
        return memo;
    }
    public static void main(String[] args) {
        int[] arr = {7, 4, 5, 9, 1, 1546, 10, 123};
        radixSort(arr);
        digit(arr);
    }
}

