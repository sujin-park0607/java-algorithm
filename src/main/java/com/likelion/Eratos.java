package com.likelion;

import java.util.ArrayList;
import java.util.List;

public class Eratos {
    public static void main(String[] args) {
        List<Integer> numArr = new ArrayList<>();
        //리스트 만들기
        for(int i=0; i<18; i++) numArr.add(i);


        int num = 2;
        for(int i=0; i<numArr.size(); i++){
            if(numArr.get(i) !=num && numArr.get(i) %num == 0){
                System.out.println("num: "+num+"/i: "+i);
                numArr.remove(i);
            }
            System.out.println(numArr.size());
        }

    }


}
