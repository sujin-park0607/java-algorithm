package com.likelion;

public class DpMinCost {
    public static void getMinCost(int[][] arr){
        int[][] dp = new int[arr.length][arr.length];
        for(int i=0; i<arr.length; i++){
            for(int j=0; j<arr.length; j++){
                if(i==0 && j==0){
                    dp[i][j] = arr[i][j];
                }
            }
        }
    }

    public static void main(String[] args) {
        int[][] arr = {{1, 3, 2}, {4, 6, 2}, {1, 2, 4}};
        getMinCost(arr);
    }

}
