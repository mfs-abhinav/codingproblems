package com.abhi.array;

import java.util.Scanner;

public class InverseArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }

        int[] iarr = new int[n];
        for (int i = 0; i < arr.length; i++) {
            iarr[arr[i]] = i;
        }

        System.out.println("Inverse of array is: ");
        for (int val: iarr) {
            System.out.print(val);
        }
    }
}
