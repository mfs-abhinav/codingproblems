package com.abhi.maths;

import java.util.Scanner;

public class AnyBaseAddition {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int b = sc.nextInt();
        int n1 = sc.nextInt();
        int n2 = sc.nextInt();

        int sum = 0;
        int c = 0;
        int exp = 0;
        while (n1 > 0 || n2 > 0 || c > 0) {
            int r1 = n1 % 10;
            int r2 = n2 % 10;

            n1 = n1 / 10;
            n2 = n2 / 10;

            int s = r1 + r2 + c;
            c = s / b;
            int n = s % b;

            sum += n * Math.pow(10, exp);
            exp++;
        }
        System.out.println(sum);
    }
}
