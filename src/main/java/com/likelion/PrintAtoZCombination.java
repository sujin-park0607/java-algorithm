package com.likelion;

public class PrintAtoZCombination {
    public static void printAlphabet(String prefix) {
        if (prefix.length() > 3) return;
        System.out.println(prefix);

        for (char c = 'A'; c <= 'Z' ; c++) {
            printAlphabet(prefix + c);
        }
    }
    public static void main(String[] args) {
        printAlphabet("");
    }
}