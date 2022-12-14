package com.likelion;

public class SumUntil {
    public static void main(String[] args) {
        int[] coins = {2, 7, 40, 19};
        int[][] dp = new int[coins.length][coins.length];

        //coin이 하나만 있는 경우
        //2 or 7 or 20 or 19
        for (int i=0; i<coins.length; i++){
            dp[i][i] = dp[coins[i]][0];
        }

        //coin이 두개 있는 경우
        for (int i=0; i<coins.length-1; i++){
            int left = Math.max(coins[i], coins[i+1]);
            int right = Math.min(coins[i], coins[i+1]);

            dp[i][i+1] = dp[left][right];
        }

        //coin이 하나만 있는 경우
        //2 or 7 or 20 or 19
        for(int i=0; i<coins.length-1; i++){
            int sum = 0;
            for(int j=i; j<coins.length-1; j++){
                sum += dp[i][j];
                dp[i][j] = sum;
                System.out.println(sum);
            }
        }
    }
}
