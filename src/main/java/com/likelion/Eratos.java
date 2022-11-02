package com.likelion;

import java.util.ArrayList;
import java.util.List;

public class Eratos {
    public static void main(String[] args) {
        List<Integer> numArr = new ArrayList<>();
        for(int i=1; i<17; i++){
            numArr.add(i);
        }

        int num = 2;
        for(int i=0; i<numArr.size(); i++){
            if(i !=num && i %num == 0){
                System.out.println("num: "+num+"i: "+i);
                numArr.remove(i);
            }

//            System.out.println("num"+num);
//            System.out.println(numArr.size());
            System.out.println(numArr);
//            System.out.println();
        }

    }


}
