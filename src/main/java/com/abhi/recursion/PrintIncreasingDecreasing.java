package com.abhi.recursion;
// print, 5 4 3 2 1 1 2 3 4 5
public class PrintIncreasingDecreasing {
    public static void main(String[] args) {
        pdi(5);
    }

    private static void pdi(int n) {
        if (n == 0) {
            return;
        }
        System.out.print(n + " ");
        pdi(n-1);
        System.out.print (n + " ");
    }
}
