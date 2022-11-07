package com.likelion;

import java.util.Arrays;
public class Eratos2 {
    public int solution(int n){
        if(n==2) return 1;
        int multipleOf;
        int[] nums = new int[n-1];
        for(int i=0; i<nums.length; i++)nums[i] = i+2;
        boolean[] checks = new boolean[nums.length];
        Arrays.fill(checks, true);
        for(int i=0; i<nums.length ; i++){
            nums[i] = i+2;
        }
        for(int j=0; j * j< n; j++){
            multipleOf = nums[j];
            for(int i=nums[j]+j; i<nums.length; i+=multipleOf){
                checks[i] = false;
            }

        }

        int cnt = 0;
        for(int i=0; i<nums.length; i++){
            if(checks[i]){
                cnt ++;
            }
        }
        return cnt;

    }
    public static void main(String[] args) {
        Eratos2 eratos = new Eratos2();
        System.out.println(eratos.solution(50));
    }
}
