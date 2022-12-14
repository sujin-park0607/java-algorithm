package com.likelion;

import java.util.Arrays;

public class SumUntil {
    public static void main(String[] args) {
        int[] coins = {2, 7, 40, 19};
        int[][] dp = new int[coins.length][coins.length];

        //coin이 하나만 있는 경우
        //2 or 7 or 20 or 19
        int i = 0;
        for(int j=0; i<coins.length; j++){
            if(j==0){
                dp[i][j] = coins[0];
            }else{
                dp[i][j] = dp[i][j-1] + coins[j];
            }
            System.out.println(Arrays.toString(dp[i]));
        }
    }
}
