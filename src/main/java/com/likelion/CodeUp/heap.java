package com.likelion.CodeUp;

import java.util.Arrays;



public class heap {
//    public void heap(int[] arr, int parentIdx, int lastIdx){
//        int left = parentIdx * 2 + 1;
//        int right = parentIdx * 2 + 2;
//        int maxIdx = parentIdx;
//
//        if(left < lastIdx && arr[lastIdx] < arr[left]){
//            maxIdx = left;
//        }
//
//        if(right < lastIdx && arr[maxIdx] < arr[right]){
//            maxIdx = right;
//        }
//
//        if(parentIdx != maxIdx){
//            int[] sortArr = swap(arr, maxIdx, parentIdx);
//            heap(sortArr, maxIdx, lastIdx);
//
//        }
//
//    }
//
//    private int[] swap(int[] arr, int maxIdx, int parentIdx) {
//        int temp = arr[maxIdx];
//        arr[maxIdx] = arr[parentIdx];
//        arr[parentIdx] = temp;
//        return arr;
//    }
//
//    public static void main(String[] args) {
//        int[] arr = new int[]{6, 5, 7, 8};
//
//        heap(arr, 6);
//
//    }
}
