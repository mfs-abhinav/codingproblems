package com.abhi.basics;

import java.util.Scanner;

public class PrimeFactorization {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        printPrimeFactorization(num);
    }

    private static void printPrimeFactorization(int n) {
        for (int i = 2; i * i <= n ; i++) {
            while (n % i == 0) {
                System.out.print(i + " ,");
                n = n / i;
            }
        }
        if (n != 1) {
            System.out.println(n);
        }
    }
}
