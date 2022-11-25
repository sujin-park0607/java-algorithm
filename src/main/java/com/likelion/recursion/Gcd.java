package com.likelion.recursion;

import java.util.Scanner;

public class Gcd {
    public static int gcd(int a, int b){
        if(a == b) {
            return a;
        }else if (a > b){
            return gcd(a-b, b);
        }else if(a < b){
            return gcd(a, b-a);
        }
        return 1;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] nums = sc.nextLine().split(" ");

        System.out.println(gcd(Integer.parseInt(nums[0]), Integer.parseInt(nums[1])));
    }
}
