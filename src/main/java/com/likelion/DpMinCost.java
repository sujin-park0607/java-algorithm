package com.likelion;

import java.util.Arrays;

public class DpMinCost {
    public static void getMinCost(int[][] arr){
        int[][] dp = new int[arr.length][arr.length];

        //첫째칸만 있는 경우
        for(int i=0; i<arr.length; i++){
            for(int j=0; j<arr.length; j++){
                if(i==0 && j==0){
                    dp[i][j] = arr[i][j];
                }else if(i == 0 && j>0){
                    dp[i][j] = dp[i][j-1] + arr[i][j];
                }else if(i>0 && j==0){
                    dp[i][j] = dp[i-1][j] + arr[i][j];
                }else{
                    dp[i][j] = Math.min(Math.min(dp[i-1][j],dp[i][j-1]), dp[i-1][j-1]) + arr[i][j];
                }
            }
            System.out.println(Arrays.toString(dp[i]));
        }

    }

    public static void main(String[] args) {
        int[][] arr = {{1, 3, 2}, {4, 6, 2}, {1, 2, 4}};
        getMinCost(arr);
    }

}
