package com.abhi.recursion;

import java.util.Scanner;

public class ReverseArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number of elements in array");
        int n = sc.nextInt();
        int[] arr = new int[n];

        for(int i = 0; i < arr.length; i++) {
            int ele = sc.nextInt();
            arr[i] = ele;
        }

        reverseArray(arr, 0);
    }

    private static void reverseArray(int[] arr, int idx) {
        if (idx == arr.length) {
            return;
        }

        reverseArray(arr, idx+1);
        System.out.println(arr[idx]);
    }
}
