package com.likelion;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class RadixSort2 {
    public static int[] digit(int[] numbers){
        Set<Integer> digitSet = new HashSet<>();
        for (int number : numbers) {
            if (number==0){
                digitSet.add(1);
            }else{
                digitSet.add((int)(Math.log10(number)+1));
            }
        }

        int[] answer = new int[digitSet.size()];
        int idx = 0;
        for (Integer set : digitSet) {
            answer[idx++] = set;
        }
        Arrays.sort(answer);
        return answer;
    }

    public static int[] radixSort(int arr[]){
        int[] memo = new int[10];

        for (int i : arr) {
            memo[i] = i;
        }
        System.out.println(Arrays.toString(arr));
        System.out.println(Arrays.toString(memo));
        return memo;
    }
    public static void main(String[] args) {
        int[] arr = {7, 4, 5, 9, 1, 1546, 10, 123};
        radixSort(arr);
        digit(arr);
    }
}

