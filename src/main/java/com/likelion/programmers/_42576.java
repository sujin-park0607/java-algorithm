package com.likelion.programmers;

import java.util.HashMap;
import java.util.Map;

public class _42576 {
    public String solution(String[] participant, String[] completion) {
        String answer = "";
        Map<String, Integer> memo = new HashMap<>();
        for (int i = 0; i < participant.length; i++) {
            String key = participant[i];
            memo.put(key, 1);
        }
        for (int i = 0; i < completion.length; i++) {
            String key = completion[i]; // value 1
            memo.put(key, 0);
        }
        for (String key : memo.keySet()) {
            if (memo.get(key) == 1) {
                return key;
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
