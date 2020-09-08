package com.abhi.array;

import java.util.Scanner;

public class MultiplyArray {
    public static void main(String[] args) {
        System.out.print("Enter number of test case ");
        Scanner sc = new Scanner(System.in);
        int noOfTestCase = sc.nextInt();
        while (noOfTestCase > 0) {
            System.out.print("Enter number of elements in array ");
            int arrayLength = sc.nextInt();
            int[] arr = new int[arrayLength];
            for (int i = 0; i < arrayLength; i++) {
                System.out.print("Enter array element ");
                arr[i] = sc.nextInt();
            }
            multiplyArray(arr);
            noOfTestCase--;
        }
    }

    private static void multiplyArray(int[] arr) {
        int result = arr[0];
        for (int i = 1; i < arr.length; i++) {
            result = result * arr[i];
        }
        System.out.println("Array multiplication is " + result);
    }
}
