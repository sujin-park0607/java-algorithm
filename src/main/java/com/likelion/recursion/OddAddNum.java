package com.likelion.recursion;

import java.util.Scanner;

public class OddAddNum {
    public static void oddAddNum(int startNum, int lastNum){
        if(startNum > lastNum) return;
        if(startNum%2==1) System.out.printf("%d ", startNum);
        oddAddNum(startNum+1, lastNum);
}

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        String[] nums = str.split(" ");
        oddAddNum(Integer.parseInt(nums[0]), Integer.parseInt(nums[1]));
    }
}
