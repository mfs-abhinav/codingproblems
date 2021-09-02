package com.abhi.recursion;

import java.util.Scanner;

public class Factorial {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number");
        int num = sc.nextInt();

        long result = calculateFact(num);
        System.out.println("Factorial of " + num + " is:- " + result);
    }

    private static long calculateFact(int num) {
        if (num == 1) {
            return 1;
        }
        return num * calculateFact(num -1);
    }
}
