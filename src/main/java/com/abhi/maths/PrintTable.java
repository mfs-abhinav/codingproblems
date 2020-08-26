package com.abhi.maths;

import java.util.Scanner;

public class PrintTable {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number of test case");
        int t = sc.nextInt();
        while (t > 0) {
            System.out.println("Enter number to generate table");
            int num = sc.nextInt();
            printTable(num);
            System.out.println();
            t--;
        }
    }
    private static void printTable(int num) {
        for (int i = 1; i <= 10; i++) {
            System.out.print(num * i + " ");
        }
        System.out.println();
    }
}
