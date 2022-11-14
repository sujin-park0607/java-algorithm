package com.likelion;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Eratos3 {
    public static void main(String[] args) {
        int N = 50;
        int[] arr = new int[N - 1];
        System.out.println(arr.length);

        for(int i=0; i<arr.length; i++){
            arr[i] = i + 2;
        }

        for(int j=0; j<arr.length; j++){
            if(arr[j] == 2) continue;
            if(arr[j] % 2 == 0){
                arr[j] = 0;
            }
        }
        System.out.println(Arrays.toString(arr));
    }
}
