package com.abhi.recursion;

import java.util.Scanner;

public class PrintArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number of elements in array");
        int n = sc.nextInt();
        int[] arr = new int[n];

        for(int i = 0; i < arr.length; i++) {
            int ele = sc.nextInt();
            arr[i] = ele;
        }

        displayArray(arr, 0);
    }

    private static void displayArray(int[] arr, int idx) {
        if (idx == arr.length) {
            return;
        }

        System.out.println(arr[idx]);
        displayArray(arr, idx+1);
    }
}
