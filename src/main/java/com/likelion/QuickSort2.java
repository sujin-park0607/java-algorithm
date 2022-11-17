package com.likelion;

import java.util.Arrays;
import java.util.stream.IntStream;

public class QuickSort2 {
    public int[] sort(int[] arr, int left, int right) {
        if (arr.length <= 0){
            return arr;
        }
        int pivot = arr.length / 2;
        while (arr[left] < arr[pivot]) left++;
        while (arr[right] > arr[pivot]) right--;
        if (left <= right) {
            int temp = arr[right];
            arr[right] = arr[left];
            arr[left] = temp;
            left++;
            right--;
        }
        int[] leftArr = IntStream.range(0, right)
                .map(i-> arr[i]).toArray();
        sort(leftArr, 0, right);

        int[] rightArr = IntStream.range(left, arr.length-1)
                .map(i-> arr[i]).toArray();
        sort(rightArr, left, arr.length-1);
    }

    public static void main(String[] args) {
        QuickSort2 quickSort = new QuickSort2();

        int[] arr = {20, 18, 5, 19, 40, 50, 5, 25};
        int left = 0;
        int right = arr.length - 1;

        quickSort.sort(arr, left, right);
        if (left <= right) {
            int temp = arr[right];
            arr[right] = arr[left];
            arr[left] = temp;
            left++;
            right--;
        }

        System.out.println(Arrays.toString(arr));

    }
}
