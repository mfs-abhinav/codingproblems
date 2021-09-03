package com.abhi.recursion;

import java.util.Scanner;

public class PrintZigZag {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        printZigZag(num);
    }

    private static void printZigZag(int num) {
        if (num == 0) {
            return;
        }
        System.out.println("Pre " + num);
        printZigZag(num-1);
        System.out.println("In " + num);
        printZigZag(num-1);
        System.out.println("Post " + num);
    }
}
