package com.likelion;

public class alphabetCount {
    public static void alphabet(){
        for(int i=65; i<=90; i++){
            System.out.println((char)i);
        }
    }

    public static void dobuleAlphabet(){
        for(int i=65; i<=90; i++){
            for(int j=65; j<=90; j++){
                System.out.printf("%c%c\n",i,j);
            }
        }
    }

    public static void main(String[] args) {
        alphabet();
        dobuleAlphabet();
    }
}
