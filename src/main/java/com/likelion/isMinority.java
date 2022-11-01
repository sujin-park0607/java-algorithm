package com.likelion;

public class isMinority {
    public boolean solution1(int num){
        for(int i=2; i<num; i++){
            if(num%i == 0){
                return false;
            }
        }
        return true;
    }

    public boolean solution2(int num){
        for(int i=2; i<num/2; i++){
            if(num%i == 0){
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        isMinority minority = new isMinority();
        int[] number = {13, 17, 19, 23};

        for (int num : number) {
            System.out.println(minority.solution2(num));
        }
    }

}
