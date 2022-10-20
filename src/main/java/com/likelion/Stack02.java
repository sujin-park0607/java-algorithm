package com.likelion;

public class Stack02 {
    private Integer[] arr;
    private int idx = -1;

    public Stack02(){
        this.arr = new Integer[10000];
    }
    public Stack02(int size) {
        this.arr = new Integer[size];
    }

    public void push(int value) {
        this.idx ++;
        this.arr[idx] = value;
    }

    public int pop() {
        int value = this.arr[this.idx];
        this.idx --;
        return value;
    }

    public Integer[] getArr() {
        return arr;
    }
}
