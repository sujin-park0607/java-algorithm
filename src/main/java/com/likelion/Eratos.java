package com.likelion;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Eratos {
    public int solution(int n) {
        List<Integer> numArr = new ArrayList<>();
        Boolean[] checks = new Boolean[n];
        //리스트 만들기
        for (int i = 2; i < n; i++) {
            numArr.add(i);
        }
        Arrays.fill(checks,true);
//        System.out.println(numArr.size()); 48
//        System.out.println(checks.length); 50

        for (int i = 2; i * i <= n; i++) {
            for (int j = 0; j < numArr.size(); j++) {
                System.out.println("numArr.get(j): "+numArr.get(j));
                System.out.println("checks[j - 2]: "+checks[i - 2]);

                if (numArr.get(j) > i && numArr.get(j) % i == 0 && checks[i - 2] == true) {
                    checks[numArr.get(i - 2)] = false;
                }
            }
        }
        for (int i = 0; i < n; i++) {
            System.out.println(checks[i]);
            System.out.println(numArr.get(i));
            if (checks[i] == false) {
                System.out.printf("%d ", numArr.get(i));
//            }
            }
        }
        return numArr.size();
    }

    public static void main (String[]args){
        Eratos isPrime = new Eratos();
        System.out.println(isPrime.solution(50));
    }
}
