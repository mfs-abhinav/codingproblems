package com.abhi.recursion;

import java.util.Scanner;

public class LastIndexOccurrence {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number of elements in array");
        int n = sc.nextInt();
        int[] arr = new int[n];

        for(int i = 0; i < arr.length; i++) {
            int ele = sc.nextInt();
            arr[i] = ele;
        }
        System.out.println("Enter element to find occurrence");
        int ele = sc.nextInt();
        sc.close();

        System.out.println("Using 1st approach: " + lastIndex1(arr, arr.length-1, ele));
        System.out.println("Using 2nd approach: " + lastIndex2(arr, 0, ele));
    }

    private static int lastIndex1(int[] arr, int n, int ele) {
        if (n == -1) {
            return -1;
        }

        int lastIndex = lastIndex1(arr, n-1, ele);
        if (arr[n] == ele) {
            return n;
        } else {
            return lastIndex;
        }
    }

    private static int lastIndex2(int[] arr, int idx, int ele) {
        if (idx == arr.length) {
            return -1;
        }
        int lastIndex = lastIndex2(arr, idx+1, ele);
        if (lastIndex == -1) {
            if (arr[idx] == ele) {
                return idx;
            } else {
                return -1;
            }
        } else {
            return lastIndex;
        }

    }
}
