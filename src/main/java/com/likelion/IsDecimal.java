package com.likelion;

public class IsDecimal {
    public boolean solution1(int num){
        for(int i=2; i<num; i++){
            if(num%i == 0) return false;
        }
        return true;
    }

    public boolean solution2(int num){
        for(int i=2; i<num/2; i++){
            if(num%i == 0) return false;
        }
        return true;
    }

    public boolean solution3(int num){
        for(int i=0; i<Math.sqrt(num); i++){
            if(num%i == 0) return false;
        }
        return true;
    }


    public static void main(String[] args) {
        IsDecimal isDecimal= new IsDecimal();
        int[] number = {13, 17, 19, 23};

        for (int num : number) {

            System.out.println(isDecimal.solution3(num));
        }
    }

}
