package com.abhi.pattern;

import java.util.Scanner;
/*
1
2   3
4   5   6
7   8   9   10
*/
public class Pattern11 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int num = 1;
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(num + "\t");
                num++;
            }
            System.out.println();
        }
    }
}
