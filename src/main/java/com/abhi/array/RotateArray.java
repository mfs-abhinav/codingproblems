package com.abhi.array;

import java.util.Scanner;

public class RotateArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }

        int r = sc.nextInt();
        r = r % arr.length;
        if (r  < 0) {
            r += arr.length;
        }
        reverseArray(arr, 0, arr.length - r - 1);
        reverseArray(arr, arr.length - r, arr.length - 1);
        reverseArray(arr, 0, arr.length - 1);

        System.out.println("Array after rotation: ");
        for (int val: arr) {
            System.out.print(val);
        }
    }

    private static void reverseArray(int[] arr, int sidx, int eidx) {
        while (sidx < eidx) {
            int temp = arr[sidx];
            arr[sidx] = arr[eidx];
            arr[eidx] = temp;

            sidx++;
            eidx--;
        }

    }
}
