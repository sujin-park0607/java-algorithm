package com.likelion.CodeUp;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

//소인수분해
public class _4037 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        List<Integer> result = new ArrayList<>();
        int i = 2;

        while(num != 1){
            if(num % i == 0){
                num/= i;
                result.add(i);
            }else{
                i++;
            }
        }
        for (Integer n : result) {
            System.out.printf("%d ",n);
        }
    }
}
