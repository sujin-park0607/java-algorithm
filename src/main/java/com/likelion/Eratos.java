package com.likelion;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Eratos {
    public int solution(int n){
        List<Integer> numArr = new ArrayList<>();
        Boolean[] checks = new Boolean[n];
        //리스트 만들기
        for(int i=2; i<n; i++){
            numArr.add(i);
            checks[i] = true;
        }

        for(int i=2; i*i <=n; i++){
            for(int j=0; j<numArr.size(); j++){
                if(numArr.get(j) > i && numArr.get(j) % i == 0 && checks[j]==true){
                    checks[j] = false;
                }
            }
        }
        for (int i=2; i<n; i++){
            if(checks[i] == true){
                System.out.printf("%d ",numArr.get(i));
            }
        }
        return numArr.size();
    }
    public static void main(String[] args) {
        Eratos isPrime = new Eratos();
        System.out.println(isPrime.solution(50));
    }
}
