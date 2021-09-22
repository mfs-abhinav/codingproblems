package com.abhi.array;

import java.util.Scanner;

public class RotateBy902dArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[][] arr = new int[n][n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                arr[i][j] = sc.nextInt();
            }
        }

        // transpose
        for (int i = 0; i < arr.length; i++) {
            for (int j = i; j < arr.length; j++) {
                int temp = arr[i][j];
                arr[i][j] = arr[j][i];
                arr[j][i] = temp;
            }
        }

        // reverse column row by row
        for (int i = 0; i < arr.length; i++) {
            int lidx = 0;
            int ridx = arr[0].length - 1;

            while (lidx <= ridx) {
                int temp = arr[i][lidx];
                arr[i][lidx] = arr[i][ridx];
                arr[i][ridx] = temp;

                lidx++;
                ridx--;
            }
        }

        display(arr);

    }
    private static void display(int[][] arr) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length; j++) {
                System.out.print(arr[i][j] + ", ");
            }
            System.out.println();
        }
    }
}
