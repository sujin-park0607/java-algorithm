package com.likelion;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Fibonacci {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();

        List<Integer> fibonacci = new ArrayList<>();
        fibonacci.add(1);
        fibonacci.add(1);
        for(int i=2; i<num; i++){
            fibonacci.add(fibonacci.get(i-1) + fibonacci.get(i-2));
        }
        System.out.println(fibonacci);
    }
}
