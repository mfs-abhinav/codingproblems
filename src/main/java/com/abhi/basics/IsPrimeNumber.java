package com.abhi.basics;

import java.util.Scanner;

public class IsPrimeNumber {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);

        int n = scn.nextInt();
        for (int i = 1; i <= n; i++) {
            int x = scn.nextInt();
            int count = 0;
            for (int j = 2; j * j <= x; j++) {
                if (x % j == 0) {
                    count++;
                    break;
                }
            }
            if (count == 0) {
                System.out.println("prime");
            } else {
                System.out.println("not prime");
            }
        }
    }
}
