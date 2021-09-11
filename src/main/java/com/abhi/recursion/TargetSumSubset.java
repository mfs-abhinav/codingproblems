package com.abhi.recursion;

import java.util.Arrays;
import java.util.Scanner;

public class TargetSumSubset {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter size of array");
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < arr.length; i++) {
            System.out.println("Enter array element");
            arr[i] = sc.nextInt();
        }
        System.out.println(Arrays.toString(arr));
        System.out.println("Enter sum to find out subset");
        int sum = sc.nextInt();

        printTargetSumSubset(arr, 0, "", 0, sum);
    }

    private static void printTargetSumSubset(int[] arr, int idx, String set, int setSum, int targetSum) {

        if (idx == arr.length) {
            if (setSum == targetSum) {
                System.out.println(set + ".");
            }
            return;
        }

        printTargetSumSubset(arr, idx + 1, set + arr[idx] + ",",setSum + arr[idx], targetSum );
        printTargetSumSubset(arr, idx + 1, set, setSum, targetSum );
    }
}
