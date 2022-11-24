package com.likelion.recursion;

import java.util.Scanner;

public class SumRecursion {
    public static int sum(int n){
        if(n == 1) return 1;
        return sum(n-1) + n;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();

        System.out.println(sum(num));
    }
}
