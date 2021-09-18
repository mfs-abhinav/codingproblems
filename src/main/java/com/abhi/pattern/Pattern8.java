package com.abhi.pattern;

import java.util.Scanner;

/*
                    *
                *
            *
        *
    *
*/
public class Pattern8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        System.out.println("Print using approach1");
        printApproach1(n);

        System.out.println("Print using approach2");
        printApproach2(n);

    }

    private static void printApproach2(int n) {
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n; j++) {
                if (j + i == n + 1) {
                    System.out.print("*");
                } else {
                    System.out.print("\t");
                }
            }
            System.out.println();
        }
    }

    private static void printApproach1(int n) {
        for (int i = 1; i <= n; i++) {
            for (int j = n; j >= 1; j--) {
                if (j == i) {
                    System.out.println("*");
                    break;
                } else {
                    System.out.print("\t");
                }
            }
        }
    }
}
