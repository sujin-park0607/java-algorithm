package com.likelion;

public class Harshard {
    //자릿수를 더하는 함수
    public int sumOfDigit(int number) {
        int sum = 0;
        while (number > 0) {
            sum += number % 10;
            number /= 10;
        }
        return sum;
    }

    //하샤드인지 확인
    public boolean isHarshard(int number, int sum) {
        if (number % sum == 0) return true;
        else return false;
    }

    public static void main(String[] args) {
        Harshard hs = new Harshard();
        int x = 11;

        int sum = hs.sumOfDigit(x);
        System.out.println(hs.isHarshard(x, sum));
    }

}
