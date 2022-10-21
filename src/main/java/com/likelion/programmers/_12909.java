package com.likelion.programmers;

import java.util.Arrays;
import java.util.Stack;

public class _12909 {
    boolean solution(String s) {
        while(s.indexOf("()") >= 0){
            s = s.replace("()","");
        }
        return s.length() == 0;
    }
}

        //        char[] arr = s.toCharArray();
//        Stack<String> stack = new Stack<>();
//
//        for (char c : arr) {
//            System.out.println(stack);
//            if(c == '('){
//                stack.push("(");
//            }else{
//                if(stack.size() != 0 && stack.peek().equals('(')){
//                    stack.pop();
//                }else{
//                    return false;
//                }
//            }
//        }
//
//        if(stack.size() != 0){
//            return false;
//        }
//        return true;

