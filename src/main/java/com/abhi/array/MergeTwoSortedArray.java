package com.abhi.array;

import java.util.Arrays;

public class MergeTwoSortedArray {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(mergeTwoSortedArray(new int[]{7,45, 76}, new int[]{8, 50, 80, 90})));
    }

    private static int[] mergeTwoSortedArray(int[] arr1, int[] arr2) {
        int i = 0;
        int j = 0;
        int k = 0;
        int len = arr1.length + arr2.length;
        int[] arr = new int[len];

        while (i < arr1.length && j < arr2.length) {
            if (arr1[i] > arr2[j]) {
                arr[k] = arr2[j];
                k++;
                j++;
            } else {
                arr[k] = arr1[i];
                k++;
                i++;
            }
        }

        while (i < arr1.length) {
            arr[k] = arr1[i];
            k++;
            i++;
        }

        while (j < arr2.length) {
            arr[k] = arr2[j];
            k++;
            j++;
        }

        return arr;
    }
}
