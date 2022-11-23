package com.likelion.recursion;

import java.util.Scanner;

public class PrintStar {
    public static void printStar(int n){
        if(n<=0) return;
        printStar(n-1);
        System.out.printf("*");
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        printStar(n);
    }
}
