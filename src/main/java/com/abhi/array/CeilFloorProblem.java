package com.abhi.array;

import java.util.Scanner;

public class CeilFloorProblem {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }

        int d = sc.nextInt();
        int ceil = 0;
        int floor = 0;

        int l = 0;
        int h = arr.length - 1;
        System.out.println("processing start...");
        while (l <= h) {
            int m = (l + h) / 2;
            if(d > arr[m]) {
                l = m + 1;
                floor = arr[m];
            } else if(d < arr[m]) {
                h = m - 1;
                ceil = arr[m];
            } else {
                floor = arr[m];
                ceil = arr[m];
                break;
            }
        }
        System.out.println("Floor is: " + floor + " and ceil is: " + ceil);
    }
}
