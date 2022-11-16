package com.likelion;

import java.util.Arrays;

public class QuickSort2 {

    public static void main(String[] args) {

        int[] arr = {20, 18, 5, 19, 40, 50, 5, 25};
        int pivot = arr.length/2;

        int left = 0;
        int right = arr.length-1;

        while(arr[left] < arr[pivot]) left ++;
        while(arr[right] > arr[pivot]) right --;
        if(left <= right){
            int temp = arr[right];
            arr[right] = arr[left];
            arr[left] = temp;
            left ++;
            right --;
        }
        if(left <= right){
            int temp = arr[right];
            arr[right] = arr[left];
            arr[left] = temp;
            left ++;
            right --;
        }

        System.out.println(Arrays.toString(arr));

    }
}
