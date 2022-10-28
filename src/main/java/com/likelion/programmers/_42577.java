package com.likelion.programmers;

import java.util.Arrays;

public class _42577 {
    public boolean solution(String[] phone_book) {
        boolean answer = true;

        //사전순으로 정렬이 된다 {12,123,78,789}
        Arrays.sort(phone_book);

        //앞뒤로만 비교
        for(int i=0; i<phone_book.length-1; i++){
//            if(phone_book[i].equals(phone_book[i+1].substring(0, phone_book[i].length()))){
            //phone_book[i]의 글자로 시작하는지
            if(phone_book[i+1].startsWith(phone_book[i])){
                return false;
            }
        }
        return answer;
    }

    public static void main(String[] args) {
        _42577 S = new _42577();
        System.out.println(S.solution(new String[]{"119", "97674223", "1195524421"}));
        System.out.println();
        System.out.println(S.solution(new String[]{"123","456","789"}));
        System.out.println();
        System.out.println(S.solution(new String[]{"12","123","1235","567","88"}));
    }
}
