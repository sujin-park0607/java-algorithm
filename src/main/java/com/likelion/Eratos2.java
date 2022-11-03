package com.likelion;

import java.util.Arrays;

public class Eratos2 {
    public static void main(String[] args) {
        int n = 50;
        int[] nums = new int[n-1];
        for(int i=0; i<nums.length; i++)nums[i] = i+2;
        boolean[] checks = new boolean[nums.length];
        Arrays.fill(checks, true);

        for(int i=0; i<nums.length ; i++){
            nums[i] = i+2;
        }

        int multipleOf = 2;
        for(int i=2; i<nums.length; i+=2){
            checks[i] = false;
        }
        System.out.println(Arrays.toString(nums));
        System.out.println(Arrays.toString(checks));

        for(int i=0; i<nums.length; i++){
            if(checks[i]){
                System.out.println(nums[i]);
            }
        }
    }
}
