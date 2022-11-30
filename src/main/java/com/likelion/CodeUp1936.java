package com.likelion;

import java.util.Scanner;

public class CodeUp1936 {
    public static int tree(int a, int b){
        if(a==b) {
            return 0;
        }else if(a > b){
            return tree(a/2,b) + 1;
        }else{
            return tree(a, b/2) + 1;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] nums = sc.nextLine().split(" ");
        System.out.println(tree(Integer.parseInt(nums[0]),Integer.parseInt(nums[1])));
    }
}
