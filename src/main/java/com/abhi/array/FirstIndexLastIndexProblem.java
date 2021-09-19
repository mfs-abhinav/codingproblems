package com.abhi.array;

import java.util.Scanner;

public class FirstIndexLastIndexProblem {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }

        int data = sc.nextInt();
        int low = 0;
        int high = arr.length - 1;
        int firstIdx = -1;
        while (low <= high) {
            int mid = (low + high) / 2;
            if(data > arr[mid]) {
                low = mid + 1;
            } else if (data < arr[mid]) {
                high = mid - 1;
            } else {
                high = mid - 1;
                firstIdx = mid;
            }
        }
        System.out.println("Firts index is: " + firstIdx);

        low = 0;
        high = arr.length - 1;
        int lastIdx = -1;
        while (low <= high) {
            int mid = (low + high) / 2;
            if(data > arr[mid]) {
                low = mid + 1;
            } else if (data < arr[mid]) {
                high = mid - 1;
            } else {
                low = mid + 1;
                lastIdx = mid;
            }
        }
        System.out.println("Last index is: " + lastIdx);
    }
}
