package com.likelion.recursion;

import java.util.Scanner;

public class fibonacciLarge {
    public static int fibonacci(int num){
        if(num <= 2) return 1;
        return fibonacci(num-2) + fibonacci(num-1);

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        System.out.println(fibonacci(num) % 10009);
    }
}
