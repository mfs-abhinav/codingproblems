package com.abhi.recursion;

import java.util.Scanner;

public class Power {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number");
        int num = sc.nextInt();

        System.out.println("Enter exponent");
        int exp = sc.nextInt();

        long result = calculatePower3(num, exp);
        System.out.println("Power of " + num + " is:- " + result);
    }

    private static long calculatePower1(int num, int exp) {
        if (exp == 1) {
            return num;
        }
        return num * calculatePower1(num, exp-1);
    }

    private static long calculatePower2(int num, int exp) {
        if (exp == 0) {
            return 1;
        }
        return calculatePower2(num, exp-1) * num;
    }

    // best case complexity is logn
    private static long calculatePower3(int num, int exp) {
        if (exp == 0) {
            return 1;
        }
        long calculateMidPower = calculatePower3(num, exp/2);
        long result = calculateMidPower * calculateMidPower;
        if (exp%2 == 1) {
            result *= num;
        }
        return result;
    }
}
