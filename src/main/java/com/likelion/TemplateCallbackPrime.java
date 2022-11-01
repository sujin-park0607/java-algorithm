package com.likelion;

import java.sql.Statement;

public class TemplateCallbackPrime {
    interface Strategy{
        boolean compare(int a, int b);
    }

    boolean someOperation(int a, int b){
        return a < b;
    }

    boolean isPrime(int num, Strategy stmt){
        for(int i=2; stmt.compare(i, num); i++){
            if(num % i == 0) return false;
        }
        return true;
    }

    public static void main(String[] args) {
        int[] number = {13, 17, 19, 23};

        TemplateCallbackPrime tcp = new TemplateCallbackPrime();

        for (int n : number) {
            boolean r = tcp.isPrime(n, new Strategy() {
                @Override
                public boolean compare(int a, int b) {
                    return a < b/2;
                }
            });
            System.out.println(r);
        }
    }


}
