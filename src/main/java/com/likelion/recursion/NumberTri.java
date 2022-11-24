package com.likelion.recursion;

import java.util.Scanner;

public class NumberTri {
    public static void number(int num){
        if(num <= 0) return;
        number(num-1);
        numberRow(num);
        System.out.println("");
    }

    public static void numberRow(int num){
        if(num <= 0) return;
        numberRow(num-1);
        System.out.printf("%d ",num);

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();

        number(num);
    }
}
