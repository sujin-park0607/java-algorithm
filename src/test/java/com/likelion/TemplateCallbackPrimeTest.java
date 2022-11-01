package com.likelion;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TemplateCallbackPrimeTest {

    @Test
    @DisplayName("소수판판별테스트")
    void 소수판별함수테스트(){
        int[] number = {13, 17, 19, 23};

        TemplateCallbackPrime tcp = new TemplateCallbackPrime();

        for(int n : number){
            boolean r = tcp.isPrime(n, new TemplateCallbackPrime.Strategy() {
                @Override
                public boolean compare(int a, int b) {
                    return a * a< b;
                }
            });
            Assertions.assertTrue(r);
        }
    }


}