package com.abhi.basics;

import java.util.Scanner;

public class ReverseNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        for (; num !=0;) {
            System.out.print(num%10);
            num = num / 10;
        }
    }
}
