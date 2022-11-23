package com.likelion.recursion;

import java.util.List;

public class ListSum {
    public static int sum(List<Integer> nums){
        if(nums.isEmpty()) return 0;
        return nums.remove(nums.size() - 1) + sum(nums);
    }

    public static void main(String[] args) {
        sum(List.of(1,2,3,4,5,6));
    }
}
