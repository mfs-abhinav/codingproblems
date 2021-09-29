package com.abhi.string;

import java.util.Scanner;

public class PrintAllPermutationsOfAStringIteratively {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        printPermutation(str);
    }

    private static void printPermutation(String str) {
        int fact = getFactorial(str.length());

        for (int i = 0; i < fact; i++) {
            StringBuilder sb = new StringBuilder(str);
            int temp = i;

            for (int divisor = str.length(); divisor >= 1; divisor--) {
                int quo = temp / divisor;
                int rem = temp % divisor;

                System.out.print(sb.charAt(rem));
                sb.deleteCharAt(rem);
                temp = quo;
            }
            System.out.println();
        }

    }

    private static int getFactorial(int n) {
        int fact = 1;
        for (int i = 1; i <= n; i++) {
            fact *= i;
        }
        return fact;
    }
}
