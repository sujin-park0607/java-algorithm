package com.likelion.recursion;

public class Print1To100 {

    public static void print1To100(int n, int sum){
        int[] arr = {7, 3, 2, 9};

        if(n > arr.length-1){
            System.out.println(sum);
            return;
        }

        print1To100(n+1, sum + arr[n]);
    }

    public static void main(String[] args) {

        print1To100(0, 0);
    }
}
