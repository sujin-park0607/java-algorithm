package com.likelion.programmers;

import java.util.ArrayList;
import java.util.List;

public class _42586 {
    public List<Integer> solution(int[] progresses, int[] speeds) {
        List<Integer> answer = new ArrayList<>();
        List<Integer> day = new ArrayList<>();


        for(int i=0; i<progresses.length; i++){
            day.add((100-progresses[i]) / speeds[i]);
        }
        System.out.println(day);
        int cnt = 1;
        int number = day.get(0);
        for(int j=1; j<day.size(); j++){
            if(number >= day.get(j)){
                cnt++;
                continue;
            }else{
                number = day.get(j);
                answer.add(cnt);
                cnt = 1;
            }
        }
        answer.add(cnt);

        System.out.println(answer);


        return answer;
    }

    public static void main(String[] args) {
        _42586 s = new _42586();
//        s.solution(new int[]{93, 30, 55}, new int[]{1, 30, 5});
//        s.solution(new int[]{95, 90, 99, 99, 80, 99}, new int[]{1, 1, 1, 1, 1, 1});
//        s.solution(new int[]{20, 99, 93, 30, 55, 10}, new int[]{5, 10, 1, 1, 30, 5});
//        s.solution(new int[]{96, 99, 98, 97}, new int[]{1,1,1,1});
        s.solution(new int[]{93, 94}, new int[]{1, 1});
    }
}
