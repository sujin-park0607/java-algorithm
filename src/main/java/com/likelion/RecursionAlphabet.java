package com.likelion;

public class RecursionAlphabet {
    public static void alphabet(int n){
        if(n < 65) return;
        alphabet(n-1);
        System.out.println((char)n);
    }

    public static void doubleAlphabet(int n){
        if(n < 65) return;
        doubleAlphabet(n-1);
        doubleAlphabet2(n,n);
    }

    public static void doubleAlphabet2(int n, int n2){
        if(n < 65) return;
        doubleAlphabet2(n-1,n2);
        System.out.printf("%c%c\n",n2,n);
    }

    public static void main(String[] args) {
        doubleAlphabet(90);
    }
}
