package com.likelion.programmers;

import java.util.ArrayList;
import java.util.List;

public class _12906 {
    public class Solution {
        public List<Integer> solution(int []arr) {
            List<Integer> answer = new ArrayList<>();
            int index = 0;
            // [실행] 버튼을 누르면 출력 값을 볼 수 있습니다.
            System.out.println("Hello Java");
            for(int i=1; i<arr.length; i++){
                if(arr[i] == arr[i-1]){
                    continue;
                }else{
                    answer.add(arr[i]);
                    index ++;
                }
            }

            return answer;
        }
    }
}
