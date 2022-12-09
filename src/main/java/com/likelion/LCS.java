package com.likelion;

import java.util.Arrays;

public class LCS {
    public static void main(String[] args) {
        String str1 = "ABCDCBA";
        String str2 = "DCABDC";

        int[][] arr = new int[str2.length()+1][str1.length()+1];

        for( int i=0; i<str2.length()+1; i++){
            for(int j=0; j<str1.length()+1; j++){
                if(i==0 || j==0){
                    arr[i][j] = 0;
                    continue;
                }

                //두개가 같으면 대각선
                if(str2.charAt(i-1) == str1.charAt(j-1)){
                    arr[i][j] =  arr[i-1][j-1] + 1;

                    //두개가 다르면 위,왼쪽 비교해서 max 사용
                }else{
                    if(arr[i-1][j] > arr[i][j-1]){
                        arr[i][j] =  arr[i-1][j];
                    }else{
                        arr[i][j] =  arr[i][j-1];
                    }
                }

            }
            System.out.println(Arrays.toString(arr[i]));
        }



    }
}