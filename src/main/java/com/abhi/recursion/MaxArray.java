package com.abhi.recursion;

import java.util.Scanner;

public class MaxArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number of elements in array");
        int n = sc.nextInt();
        int[] arr = new int[n];

        for(int i = 0; i < arr.length; i++) {
            int ele = sc.nextInt();
            arr[i] = ele;
        }

        System.out.println(maxArray(arr, 0));
    }

    private static int maxArray(int[] arr, int idx) {
        if (idx == arr.length-1) {
            return arr[idx];
        }

        int max = arr[idx];
        int maxC = maxArray(arr, idx+1);
        if (max < maxC) {
            max = maxC;
        }
        return max;
    }
}
