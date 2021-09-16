package com.abhi.basics;

import java.util.Scanner;

public class PathagoreanTriplets {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n1 = sc.nextInt();
        int n2 = sc.nextInt();
        int n3 = sc.nextInt();

        printIsPathagoreanTriplets(n1, n2, n3);
    }

    private static void printIsPathagoreanTriplets(int a, int b, int c) {
        int max = a;
        if (b >= max) {
            max = b;
        }
        if (c >= max) {
            max = c;
        }

        if (max == a) {
            System.out.println((a * a) == (b * b + c * c ));
        } else if (max == b) {
            System.out.println((b * b) == (a * a + c * c ));
        } else {
            System.out.println((c * c) == (a * a + b * b ));
        }
    }
}
