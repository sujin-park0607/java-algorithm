package com.likelion.programmers;

import java.lang.reflect.Array;
import java.util.Arrays;

public class _12950 {
    public int[][] solution(int[][] arr1, int[][] arr2) {
        int row = arr1.length;
        int col = arr1[0].length;
        int[][] answer = new int[row][col];
        for (int i = 0; i < row; i++){
            for(int j=0; j<col; j++){
                answer[i][j] = arr1[i][j] + arr2[i][j];
            }
        }
        for (int[] an : answer) {
            System.out.println(Arrays.toString(an));
        }
        return answer;
    }

    public static void main(String[] args) {
        _12950 s = new _12950();
        int[][] arr1 = {{1,2},{2,3}};
        int[][] arr2 = {{3,4},{5,6}};
        s.solution(arr1, arr2);
    }
}
