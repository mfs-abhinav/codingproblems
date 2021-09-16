package com.abhi.basics;

import java.util.Scanner;

public class GcdAndLcm {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num1 = sc.nextInt();
        int num2 = sc.nextInt();

        printGcdAndLcm(num1, num2);
        printGcdAndLcmBestApproach(num1, num2);
    }

    private static void printGcdAndLcmBestApproach(int n1, int n2) {
        int on1 = n1;
        int on2 = n2;
        while (n1 % n2 != 0) {
            int rem = n1 % n2;
            n1 = n2;
            n2 = rem;
        }
        int gcd = n2;
        int lcm = (on1 * on2) / gcd;
        System.out.println("GCD best: " + gcd);
        System.out.println("LCM best: " + lcm);
    }

    private static void printGcdAndLcm(int n1, int n2) {
        int gcd = 1;

        int loopCount = n1 > n2 ? n2 : n1;

        for (int i = 1; i<= loopCount; i++) {
            if (n1 % i == 0 && n2 % i == 0) {
                gcd = i;
            }
        }
        System.out.println("GCD is: " + gcd);
        int lcm = gcd;
        int i = 1;
        while (true) {
            if (lcm % n1 == 0 && lcm % n2 == 0) {
                break;
            }
            lcm = lcm  * i;
            i++;
        }
        System.out.println("LCM is: " + lcm);
    }
}
