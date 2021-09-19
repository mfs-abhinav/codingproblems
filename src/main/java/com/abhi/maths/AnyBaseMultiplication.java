package com.abhi.maths;

import java.util.Scanner;

public class AnyBaseMultiplication {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int b = sc.nextInt();
        int n1 = sc.nextInt();
        int n2 = sc.nextInt();

        int prd = 0;
        int exponent = 0;
        while (n2 > 0) {
            int r = n2 % 10;
            n2 = n2 / 10;

            int pwsd = getProductWithSingleDigit(b, n1, r);
            int numberAfteOneLeftShift = (int) (pwsd * Math.pow(10, exponent));
            prd = anyBaseAddition(b, prd, numberAfteOneLeftShift);
            exponent++;
        }
        System.out.println("Product is: " + prd);
    }
    private static int getProductWithSingleDigit(int b, int n, int d) {
        int res = 0;

        int c = 0;
        int exponent = 0;
        while (n > 0 || c > 0) {
            int r = n % 10;
            n = n / 10;

            int digit = r * d + c;
            c = digit / b;
            digit = digit % b;

            res += digit * Math.pow(10, exponent);
            exponent++;
        }
        return res;
    }
    private static int anyBaseAddition(int b, int n1, int n2) {
        int res = 0;

        int c = 0;
        int exponent = 0;
        while (n1 > 0 || n2 > 0 || c > 0) {
            int r1 = n1 % 10;
            n1 = n1 / 10;

            int r2 = n2 % 10;
            n2 = n2 / 10;

            int d = r1 + r2 + c;
            c = d / b;
            d = d % b;

            res += d * Math.pow(10, exponent);
            exponent++;
        }

        return res;
    }
}
