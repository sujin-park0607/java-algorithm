package com.likelion;

public class Print1To100 {

    public static void print1To100(int num){
        if(num > 100) return;
        System.out.println(num);
        print1To100(num +1);
    }

    public static void main(String[] args) {
        print1To100(1);
    }
}
