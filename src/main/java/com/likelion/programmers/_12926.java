package com.likelion.programmers;

public class _12926 {
    public String solution(String s, int n) {
        String answer = "";
        char[] arr = s.toCharArray();

        for (char num : arr) {
            if(num==32){
                num=32;
            }else{
                if(num-n > 96 && num-n < 123 && num > 122) num -= 26;
                else if(num-n > 64 && num-n < 91 && num > 90) num -= 26;
                num += n;
            }
            answer += (char)num;

        }
        System.out.println(answer);
        return answer;
    }


    public static void main(String[] args) {
        _12926 solution = new _12926();
        solution.solution("a B z", 4);
    }
}
