package com.likelion;

public class RecursionAlphabet {
    public static void alphabet(int n){
        if(n < 65) return;
        alphabet(n-1);
        System.out.println((char)n);
    }

    public static void main(String[] args) {
        alphabet(90);
    }
}
