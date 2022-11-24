package com.likelion.recursion;

import java.util.Scanner;

public class PrintStar2 {
    public static void printStar(int num){
        if(num <= 0) return;
        printStar(num-1);
        System.out.printf("*");
    }

    public static void printStar2(int num){
        if(num <= 0) return;
        printStar2(num-1);
        printStar(num);
        System.out.println("");
    }



    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();

        printStar2(num);
    }
}
