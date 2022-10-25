//package com.likelion.programmers;
//
//import java.util.Arrays;
//import java.util.Stack;
//
//public class _12909 {
//    boolean solution(String s) {
////        while(s.indexOf("()") >= 0){
////            s = s.replace("()","");
////        }
////        return s.length() == 0;
//
//
//        char[] arr = s.toCharArray();
//        Stack<Character> stack = new Stack<>();
//
//        for (char c : arr) {
//            if(c == '(' || c == '{' || c == '['){
//                stack.push()
//            }
//            else{
//                if(stack1.isEmpty()){
//                    return false;
//                }else if(c == ')' || c == '}' || c == ']'){
//                    if(c == ')' && stack1.peek() ==')'){
//                        return false;
//                    }else if(c == '}' && stack2.peek() =='}'){
//                        return false;
//                    }else if(c == ']' && stack3.peek() =='}'){
//                        return false;
//                }else{
//                        stack1.pop();
//                    }
//            }
//        }
//        }
//
//        if(stack1.isEmpty() == false){
//            return false;
//        }
//        return true;
//    }
//}