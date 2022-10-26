package com.likelion.programmers;

import java.util.*;
import java.util.stream.Stream;

public class _42576 {
    public String solution(String[] participant, String[] completion) {
        String answer = "";

        String[] arr = Stream
                .concat(Arrays.stream(participant), Arrays.stream(completion))
                .toArray(String[]::new);

        HashMap<String,Integer> map = new HashMap<>();

        for (Map.Entry<String,Integer> item : map.entrySet()){

            item.setValue(item.getValue() * 10);
        }
        출처: https://developer-talk.tistory.com/745 [평범한 직장인의 공부 정리:티스토리]

        return answer;
    }
}
