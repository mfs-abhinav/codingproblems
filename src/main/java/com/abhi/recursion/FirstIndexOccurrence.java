package com.abhi.recursion;

import java.util.Scanner;

public class FirstIndexOccurrence {
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

        System.out.println("Using 1st approach: " + firstIndex1(arr, 0, ele));
        System.out.println("Using 2nd approach: " + firstIndex2(arr, 0, ele));
    }

    private static int firstIndex1(int[] arr, int idx, int ele) {
        if (idx == arr.length) {
            return -1;
        }

        int index = firstIndex1(arr, idx+1, ele);
        if (arr[idx] == ele) {
            return idx;
        } else {
            return index;
        }
    }
    private static int firstIndex2(int[] arr, int idx, int ele) {
        if (idx == arr.length) {
            return -1;
        }

        if (arr[idx] == ele) {
            return idx;
        } else {
            int index = firstIndex2(arr, idx+1, ele);
            return index;
        }
    }
}
