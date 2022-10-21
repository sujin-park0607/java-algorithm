package com.likelion.programmers;

import java.util.Arrays;
import java.util.Stack;

public class _12909 {
    boolean solution(String s) {
//        while(s.indexOf("()") >= 0){
//            s = s.replace("()","");
//        }
//        return s.length() == 0;


        char[] arr = s.toCharArray();
        Stack<Character> stack = new Stack<>();

        for (char c : arr) {
            if(c == '('){
                stack.push('(');
            }else{
                if(stack.isEmpty() || stack.peek() ==')'){
                    return false;
                }else{
                    stack.pop();
                }
            }
        }

        if(stack.isEmpty() == false){
            return false;
        }
        return true;
    }
}