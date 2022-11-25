package com.likelion;

import java.util.Scanner;

public class Gcd {
    public static int gcd(int a, int b){
        int temp;
        int n;

        if(a < b){
            temp = a;
            a = b;
            b = temp;
        }

        while(b != 0){
            n = a%b;
            a = b;
            b = n;
        }
        return a;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] nums = sc.nextLine().split(" ");
        System.out.println(gcd(Integer.parseInt(nums[0]), Integer.parseInt(nums[1])));
    }
}
