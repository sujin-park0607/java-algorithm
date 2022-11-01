package com.likelion;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TemplateCallbackPrimeTest {

    @Test
    @DisplayName("익명함수 사용")
    void 소수_판별_함수_테스트_익명함수(){
        int[] number = {13, 17, 19, 23};

        TemplateCallbackPrime tcp = new TemplateCallbackPrime();

        for(int n : number){
            boolean r = tcp.isPrime(n, (a,b) -> a*a<b);
            assertEquals(true, r);
        }
    }

    @Test
    @DisplayName("람다식 사용")
    void 소수_판별_함수테스트_람다식(){
        int[] number = {13, 17, 19, 23};

        TemplateCallbackPrime tcp = new TemplateCallbackPrime();

        for(int n : number){
            boolean r = tcp.isPrime(n, new TemplateCallbackPrime.Strategy() {
                @Override
                public boolean compare(int a, int b) {
                    return a * a< b;
                }
            });
            assertTrue(r);
        }
    }




}