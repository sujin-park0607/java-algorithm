package com.likelion.programmers;

import java.util.Scanner;

public class _12928 {
    public static int sumOfDivisor(int num){
        int sum = 0;
        for(int i=1; i<=num; i++){
            if(num%i == 0) sum += i;
        }
        return sum;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        System.out.println(sumOfDivisor(num));
    }
}
