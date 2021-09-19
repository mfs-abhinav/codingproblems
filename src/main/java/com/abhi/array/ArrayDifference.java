package com.abhi.array;

import java.util.Scanner;

public class ArrayDifference {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n1 = sc.nextInt();
        int[] arr1 = new int[n1];
        for (int i = 0; i < arr1.length; i++) {
            arr1[i] = sc.nextInt();
        }
        int n2 = sc.nextInt();
        int[] arr2 = new int[n2];
        for (int i = 0; i < arr2.length; i++) {
            arr2[i] = sc.nextInt();
        }

        int[] diff = new int[n2];
        int i = arr2.length - 1;
        int j = arr1.length - 1;
        int k = diff.length - 1;

        int c = 0;
        while (k >= 0) {
            int val;
            if (j >= 0) {
               val = arr1[j];
            } else {
                val = 0;
            }

            if (arr2[i] + c >= val) {
                diff[k] = arr2[i] + c - val;
                c = 0;
            } else {
                diff[k] = arr2[i] + c + 10 - val;
                c = -1;
            }
            i--;
            j--;
            k--;
        }
        int idx = 0;
        while (idx < diff.length) {
            if (diff[idx] != 0) {
                break;
            } else {
                idx++;
            }
        }
        System.out.println("Difference is: ");
        while (idx < diff.length) {
            System.out.print(diff[idx]);
            idx++;
        }
    }
}

