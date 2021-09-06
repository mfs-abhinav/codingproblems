package com.abhi.recursion;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class AllIndicesOfOccurrence {
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

        System.out.println("All indices using 1st approach: " + allIndices1(arr, 0, ele));
        System.out.println("All indices using best approach: " + Arrays.toString(allIndices2(arr, 0, ele, 0)));
    }

    private static List<Integer> allIndices1(int[] arr, int idx, int ele) {
        if (idx == arr.length) {
            return new ArrayList<>();
        }
        List<Integer> allIndices = allIndices1(arr, idx+1, ele);
        if (arr[idx] == ele) {
            allIndices.add(idx);
        }
        return allIndices;
    }

    private static int[] allIndices2(int[] arr, int idx, int ele, int fsf) {
        if (idx == arr.length) {
            return new int[fsf];
        }
        if (arr[idx] == ele) {
            int[] allIndices = allIndices2(arr, idx+1, ele, fsf+1);
            allIndices[fsf] = idx;
            return allIndices;
        } else {
            int[] allIndices = allIndices2(arr, idx+1, ele, fsf);
            return allIndices;
        }
    }
}
