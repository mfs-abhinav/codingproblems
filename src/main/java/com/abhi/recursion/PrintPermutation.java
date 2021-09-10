package com.abhi.recursion;

import java.util.Scanner;

public class PrintPermutation {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter string");
        String str = sc.next();

        printPermutation(str, "");
    }

    private static void printPermutation(String str, String path) {
        if (str.length() == 0) {
            System.out.print(path + ", ");
            return;
        }

        for(int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            printPermutation(str.substring(0, i) + str.substring(i+1), path + ch);
        }
    }
}
