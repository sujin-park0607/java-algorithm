package com.likelion.programmers;

import java.util.*;
import java.util.stream.Stream;

public class _42576Finish {
    public String solution(String[] participant, String[] completion) {
        String answer = "";

        //배열 두개 합쳐진 하나의 배열 만들기
        String[] arr = Stream
                .concat(Arrays.stream(participant), Arrays.stream(completion))
                .toArray(String[]::new);

        //해쉬 생성
        HashMap<String,Integer> map = new HashMap<>();

        //dicionary 초기화 ,  key는 이름, value는 이름이  나온 횟수
        for (String name : arr) {
            if(map.containsKey(name)){
                map.put(name,map.get(name) + 1);
            }else{
                map.put(name,1);
            }
        }

        //2로 나누어 나머지가 있으면 return
        for( Map.Entry<String, Integer> elem : map.entrySet() ){
            if(elem.getValue() % 2 != 0){
                return elem.getKey();
            }
        }
        return answer;
    }

    public static void main(String[] args) {
        _42576Finish S = new _42576Finish();
        String name = S.solution(new String[]{"leo", "kiki", "eden"}, new String[]{"eden", "kiki"});
        System.out.println(name);
    }
}
