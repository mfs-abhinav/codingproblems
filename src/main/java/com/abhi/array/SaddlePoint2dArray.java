package com.abhi.array;

import java.util.Scanner;

public class SaddlePoint2dArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[][] arr = new int[n][n];

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                arr[i][j] = sc.nextInt();
            }
        }

        for (int i = 0; i < arr.length; i++) {
            int svj = 0;
            for (int j = 1; j < arr[0].length; j++) {
                if (arr[i][j] < arr[i][svj]) {
                    svj = j;
                }
            }
            boolean flag = true;
            for (int k = 0; k < arr.length; k++) {
                if (arr[k][svj] > arr[i][svj]) {
                    flag = false;
                    break;
                }
            }
            if (flag) {
                System.out.print("(" + i + ", " + svj + ") -> " +  arr[i][svj]);
                return;
            }
        }
        System.out.println("Invalid input");

    }
}
