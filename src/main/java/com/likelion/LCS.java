package com.likelion;

public class LCS {
    public static void main(String[] args) {
        String str1 = "ABCDCBA";
        String str2 = "DCABDC";

        int[][] arr = new int[str2.length()][str1.length()+1];

        for( int i=0; i<str2.length(); i++){
            for(int j=0; j<str1.length(); j++){
                System.out.printf("i:%s j:%s\n");
            }
        }


    }
}
