package com.likelion.CodeUp;

import java.util.Arrays;
import java.util.Scanner;

public class _2699 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str1 = sc.nextLine();
        String str2 = sc.nextLine();

        int[][] dp = new int[str2.length()+1][str1.length()+1];

        for(int i=0; i<str2.length()+1; i++){
            for(int j=0; j<str1.length()+1; j++){

                if(i==0 || j==0){
                    dp[i][j] = 0;
                    continue;
                }

                if(str2.charAt(i-1) == str1.charAt(j-1)){
                    dp[i][j] = dp[i-1][j-1] + 1;
                }else{
                    if(dp[i-1][j] > dp[i][j-1]){
                        dp[i][j] = dp[i-1][j];
                    }else{
                        dp[i][j] = dp[i][j-1];
                    }
                }
            }
        }
        System.out.println(dp[str2.length()][str1.length()]);
    }
}
