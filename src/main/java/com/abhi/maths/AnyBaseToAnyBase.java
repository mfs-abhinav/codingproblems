package com.abhi.maths;

import java.util.Scanner;

public class AnyBaseToAnyBase {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int nb = sc.nextInt();
        int cb = sc.nextInt();

        int dnum = convertToDecimalNumber(n, nb);
        int cnum = decimalToAnyBase(dnum, cb);
        System.out.println(cnum);
    }

    private static int decimalToAnyBase(int n, int cb) {
        int res = 0;
        int exp = 0;
        while (n > 0) {
            int rem = n % cb;
            n = n / cb;
            res += rem * Math.pow(10, exp);
            exp++;
        }
        return res;
    }

    private static int convertToDecimalNumber(int n, int nb) {
        int res = 0;
        int exp = 0;
        while (n > 0) {
            int rem = n % 10;
            n = n / 10;
            res += rem * Math.pow(nb, exp);
            exp++;
        }
        return res;
    }
}
