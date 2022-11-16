package com.likelion;

public class QuickSort2 {
    public int standard(int[] arr){
        return arr.length/2;
    }

    public static void main(String[] args) {
        QuickSort2 quickSort = new QuickSort2();

        int[] arr = {20, 18, 5, 19, 40, 50, 5, 25};
        int pivot = quickSort.standard(arr);

        int left = 0;
        int right = arr.length-1;

        while(left <= right){
            if(arr[left] < arr[pivot]){
                left ++;
            }else if(arr[right] > arr[pivot])
                right --;
        }
        System.out.println(arr[left]);

    }
}
