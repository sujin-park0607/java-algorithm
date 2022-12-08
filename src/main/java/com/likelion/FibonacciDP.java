package com.likelion;

import java.util.Scanner;

public class FibonacciDP {
    static int[] dp = new int[1000];
    static int fibonacci(int n){
        if(n == 0) return 0;
        if(n == 1) return 1;
        if(dp[n] != 0) return dp[n];
        dp[n] = fibonacci(n - 2) + fibonacci(n - 1);
        return dp[n];
    }

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        System.out.println(fibonacci(N));
    }

}
