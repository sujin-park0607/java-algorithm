package com.likelion.recursion;

import java.util.Scanner;

public class Print1To100 {

    public static void print1To100(int num, int n){
        if(n > num) return;
        System.out.printf("%d ",n);
        print1To100(num, n+1);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        print1To100(num, 1);
    }
}
