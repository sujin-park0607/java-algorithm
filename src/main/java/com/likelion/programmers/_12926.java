package com.likelion.programmers;

public class _12926 {
        public String solution(String s, int n) {
            String answer = "";

            for(int i=0; i<s.length(); i++){
                int num = (int)s.charAt(i)+n;
                if(num >= 91 && num <= 96) num -= 26;
                if(num>= 122) num -= 26;
                if(num-n == 32) num -= n;


                char ch = (char)num;

                answer += ch;
            }
            System.out.println(answer);
           return answer;
        }

    public static void main(String[] args) {
        _12926 solution = new _12926();
        solution.solution("a B z",4);
    }
}
