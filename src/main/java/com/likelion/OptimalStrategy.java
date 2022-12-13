package com.likelion;

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
            dp[i][i+1] = new Pair(coins[i],coins[i+1]);
        }

        for(int i=0; i<coins.length-1; i++){
            System.out.println(dp[i][i+1].toString());
        }
    }

}
