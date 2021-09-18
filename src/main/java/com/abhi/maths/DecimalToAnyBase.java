package com.abhi.maths;

import java.util.Scanner;

public class DecimalToAnyBase {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int b = sc.nextInt();
        int res = 0;
        int exp = 0;
        while (num > 0) {
            int rem = num % b;
            num = num / b;
            res += rem * Math.pow(10, exp);
            exp++;
        }
        System.out.println(res);
    }
}
