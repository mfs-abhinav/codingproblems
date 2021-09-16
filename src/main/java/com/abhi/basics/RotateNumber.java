package com.abhi.basics;

import java.util.Scanner;

public class RotateNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int rotation = sc.nextInt();

        printRotateNumber(num, rotation);
    }

    private static void printRotateNumber(int n, int r) {
        int num = n;
        int noOfDigit = 0;
        while ( num != 0) {
            noOfDigit++;
            num = num / 10;
        }

        r = r % noOfDigit;
        if (r < 0) {
            r = r + noOfDigit;
        }

        int div = 1; //(int) Math.pow(10, r);
        int mul = 1; //(int) Math.pow(10, noOfDigit - r);
        for (int i = 1; i <= noOfDigit; i++) {
            if (i <= r) {
                div = div * 10;
            } else {
                mul = mul * 10;
            }
        }

        int rem = n % div;
        int quotient = n / div;
        int numberAfterRotation = rem * mul + quotient;
        System.out.println(numberAfterRotation);
    }
}
