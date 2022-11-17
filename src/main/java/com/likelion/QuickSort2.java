package com.likelion;

import java.util.Arrays;
import java.util.stream.IntStream;

public class QuickSort2 {
    public int[] sort(int[] arr, int startIdx, int endIdx) {
        int left = startIdx;
        int right = endIdx;
        int pivot = (startIdx+endIdx) / 2;
        while (arr[left] < arr[pivot]) left++;
        while (arr[right] > arr[pivot]) right--;
        if (left <= right) {
            int temp = arr[right];
            arr[right] = arr[left];
            arr[left] = temp;
            left++;
            right--;
        }

        System.out.printf("leftIdx: %d / rightIdx: %d\n", left, right);
        if(startIdx < right) sort(arr, startIdx, right);
        if(left < endIdx) sort(arr, left, endIdx);

        return arr;
    }

    public static void main(String[] args) {
        QuickSort2 quickSort = new QuickSort2();

        int[] arr = {20, 18, 5, 19, 40, 50, 5, 25};
        int left = 0;
        int right = arr.length - 1;

        quickSort.sort(arr, left, right);
        System.out.println(Arrays.toString(arr));

    }
}
