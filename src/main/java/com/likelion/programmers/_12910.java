package com.likelion.programmers;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class _12910 {
    public static void main(String[] args) {
        int[] arr = {5, 9, 7, 10};
        int divisor = 5;
        List<Integer> answer = new ArrayList<>();

        for (int num : arr) {
            if(num%divisor == 0){
                answer.add(num);
            }
        }
        if(answer.size() == 0) answer.add(-1);

        Collections.sort(answer);
        answer.stream().mapToInt(i->i).toArray();
        System.out.println(answer);
    }


}
