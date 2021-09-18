package com.abhi.maths;

import java.util.Scanner;

public class AnyBaseSubtraction {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int b = sc.nextInt();
        int n1 = sc.nextInt();
        int n2 = sc.nextInt();

        int sub = 0;
        int exp = 0;
        int c = 0;
        while (n2 > 0) {
            int r1 = n1 % 10;
            n1 = n1 / 10;
            int r2 = n2 % 10;
            n2 = n2 / 10;

            int d = r2 - r1 - c;
            if(d < 0){
                c = 1;
                d += b;
            } else {
                c = 0;
            }

            sub += d * Math.pow(10, exp);
            exp++;
        }
        System.out.println(sub);
    }
}
