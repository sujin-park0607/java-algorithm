package com.likelion;

public class LCS {
    public static void main(String[] args) {
        String str1 = "ABCDCBA";
        String str2 = "DCABDC";

        int[][] arr = new int[str2.length()][str1.length()+1];

        for( int i=0; i<str2.length(); i++){
            for(int j=0; j<str1.length(); j++){
                System.out.printf("i:%s j:%s\n", str2.charAt(i), str1.charAt(j));

                //두개가 같으면 대각선
                if(str2.charAt(i) == str1.charAt(j)){
                    arr[j][i] =  arr[j-1][i-1];
                    System.out.println(arr[j][i]);

                    //두개가 다르면 위,왼쪽 비교해서 max 사용
                }else{
                    if(arr[j-1][i] > arr[j][i-1]){
                        arr[j][i] =  arr[j-1][i];
                    }else{
                        arr[j][i] =  arr[j][i-1];
                    }
                }

            }
        }


    }
}