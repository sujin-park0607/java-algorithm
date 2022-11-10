package com.likelion.programmers;

import java.util.Arrays;
import java.util.Stack;

public class _12960Stack {
    public Stack<Integer> solution(int[] arr) {
        Stack<Integer> stack = new Stack<>();

        for (int i = 0; i < arr.length; i++) {

            if (!stack.empty() && stack.peek() == arr[i]) {
                continue;
            } else {
                stack.add(arr[i]);
            }
        }

        return stack;
    }

    public static void main(String[] args) {
        _12960Stack s = new _12960Stack();
        Stack<Integer> answer = s.solution(new int[]{1, 1, 3, 3, 0, 1, 1});
        System.out.println(answer);
    }
}
