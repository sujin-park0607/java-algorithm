package com.likelion.recursion;

import java.util.Scanner;

public class Print1To100 {

    public static void print1To100(int num, int n){
        if(n > num) return;
        print1To100(num, n+1);
        System.out.println(n);

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        print1To100(num, 1);
    }
}
