package com.likelion;

import java.sql.Statement;

public class TemplateCallbackPrime {
    interface Strategy{
        boolean compare(int a, int b);
    }


    boolean isPrime(int num, Strategy stmt){
        for(int i=2; stmt.compare(i, num); i++){
            if(num % i == 0) return false;
        }
        return true;
    }


}
