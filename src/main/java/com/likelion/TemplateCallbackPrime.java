package com.likelion;

public class TemplateCallbackPrime {

    boolean someOperation(int a, int b){
        return a < b;
    }


    boolean isPrime(int num){
        for(int i=0; someOperation(i, num); i++){
            if(num % i == 0) return false;
        }
        return true;
    }

    public static void main(String[] args) {
        int[] number = {13, 17, 19, 23};

        TemplateCallbackPrime tcp = new TemplateCallbackPrime();

        boolean r = tcp.isPrime(17);
        System.out.println(r);
    }


}
