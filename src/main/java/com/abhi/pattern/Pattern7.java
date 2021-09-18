package com.abhi.pattern;

import java.util.Scanner;

/*
*
    *
        *
            *
                *
*/
public class Pattern7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        System.out.println("Print using approach1");
        printUsingApproach1(n);

        System.out.println("Print using approach2");
        printUsingApproach2(n);

    }

    private static void printUsingApproach1(int n) {
        int space = 0;
        for (int i = 1; i <= n; i++) {
            for (int j = 0; j < space; j++) {
                System.out.print("\t");
            }
            space++;
            System.out.println("*");
        }
    }

    private static void printUsingApproach2(int n) {
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n; j++) {
                if (i == j) {
                    System.out.print("*\t");
                } else {
                    System.out.print("\t");
                }
            }
            System.out.println();
        }
    }
}
