package com.likelion;

import java.util.Arrays;

class Pair{
    int left;
    int right;

    @Override
    public String toString() {
        return "Pair{" +
                "left=" + left +
                ", right=" + right +
                '}';
    }

    public Pair(int left, int right){
        this.left = left;
        this.right = right;
    }
}
public class OptimalStrategy {
    public static void main(String[] args) {
        int[] coins = {2, 7, 40, 19};

        Pair[][] dp = new Pair[coins.length][coins.length];

        //coin이 하나만 있는 경우
        //2 or 7 or 20 or 19
        for (int i=0; i<coins.length; i++){
            dp[i][i] = new Pair(coins[i],0);
        }

        //coin이 두개 있는 경우
        for (int i=0; i<coins.length-1; i++){
            int left = Math.max(coins[i], coins[i+1]);
            int right = Math.min(coins[i], coins[i+1]);

            dp[i][i+1] = new Pair(left,right);
        }

        for(int i=0; i<dp.length-1; i++) {
            for (int j = 0; j < dp.length-1; j++) {
                System.out.printf(" (%s) ",dp[i][j].toString());
            }
            System.out.println();
        }
    }

}
