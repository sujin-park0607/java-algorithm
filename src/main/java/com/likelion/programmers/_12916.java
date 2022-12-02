package com.likelion.programmers;

import java.util.Scanner;

public class _12916 {
    public static boolean pOrY(String input){
        String[] inputArr = input.split("");
        int result = 0;
        for (String s : inputArr) {
            if(s.equals("p") || s.equals("P")) result++;
            else if (s.equals("y") || s.equals("Y")) result --;
        }

        if(result==0) return true;
        else return false;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();
        System.out.println(pOrY(input));
    }
}
