package com.likelion;

import java.util.Scanner;

public class TotalSum {
    public static int totalSum(int n){
        if(n < 10) return n;
        return totalSum(n/10)+n%10;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int sum = totalSum(num);
        System.out.println(sum);
    }
}
