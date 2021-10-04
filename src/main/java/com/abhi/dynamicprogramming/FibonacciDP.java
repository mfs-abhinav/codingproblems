package com.abhi.dynamicprogramming;

import java.util.Scanner;

public class FibonacciDP {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        System.out.println("Print using iterative approach....");
        printFibonacciUsingIterative(n);

        System.out.println("\nPrint using recursive approach....");
        printFibonacciUsingRecursive(n);

        System.out.println("\nPrint using dynamic programming approach 1....");
        printFibonacciUsingDP1(n);

        System.out.println("\nPrint using dynamic programming approach 2....");
        printFibonacciUsingDP2(n);

    }

    private static void printFibonacciUsingDP2(int n) {
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            if (i == 0 || i == 1) {
                arr[i] = i;
            } else {
                arr[i] = arr[i - 1] + arr[i - 2];
            }
        }
        for (int i: arr) {
            System.out.print(i + ", ");
        }
    }

    private static void printFibonacciUsingDP1(int n) {
        for (int i = 0; i < n; i++) {
            int[] arr = new int[i + 1];
            System.out.print(printDP1(i, arr) + ", ");
        }
    }

    private static int printDP1(int n, int[] arr) {

        if (n == 0 || n == 1) {
            return n;
        }

        if (arr[n] != 0) {
            return arr[n];
        }

        int c = printDP1(n - 1, arr) + printDP1(n - 2, arr);
        arr[n] = c;
        return c;
    }

    private static void printFibonacciUsingRecursive(int n) {
        for (int i = 0; i < n; i++) {
            System.out.print(printRecursive(i) + ", ");
        }
    }

    private static int printRecursive(int n) {
        if (n == 0 || n == 1) {
            return n;
        }
        return printRecursive(n - 1) + printRecursive(n - 2);
    }

    private static void printFibonacciUsingIterative(int n) {
        int cur = 0;
        int next = 1;

        for (int i = 0; i < n; i++) {
            System.out.print(cur + ", ");
            int c = cur + next;
            next = cur;
            cur = c;
        }
    }
}
