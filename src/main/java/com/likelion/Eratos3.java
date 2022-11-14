package com.likelion;

import java.util.Arrays;


public class Eratos3 {
    public static void main(String[] args) {
        int N = 50;
        int[] arr = new int[N - 1];
        System.out.println(arr.length);

        for (int i = 0; i < arr.length; i++) arr[i] = i + 2;


        for (int j = 1; j < arr.length; j++) {
            if (j % 2 == 0) {
                arr[j] = 0;
            }
        }
        System.out.println(Arrays.toString(arr));
    }
}
