package com.likelion;

import java.util.Scanner;

public class TotalSum {
    public static int totalSum(int n){
        if(n <= 1) return 1;
        return totalSum(n-1)+n;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int sum = totalSum(num);
        System.out.println(sum);
    }
}
