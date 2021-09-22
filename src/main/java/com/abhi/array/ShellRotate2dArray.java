package com.abhi.array;

import java.util.Scanner;

public class ShellRotate2dArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int[][] arr = new int[n][m];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                arr[i][j] = sc.nextInt();
            }
        }
        int s = sc.nextInt();
        int r = sc.nextInt();
        shellRotate(arr, s, r);
        display(arr);
    }

    private static void shellRotate(int[][] arr, int s, int r) {
        int[] oneDArr = get1DArrayFromShell(arr, s);
        rotate1DArray(oneDArr, r);
        fill1DArrayIntoShell(arr, oneDArr, s);
    }

    private static void fill1DArrayIntoShell(int[][] arr, int[] arr1D, int s) {
        int minr = s - 1;
        int minc = s - 1;
        int maxr = arr.length - s;
        int maxc = arr[0].length - s;

        // left
        int idx = 0;
        for (int i = minr; i <= maxr; i++) {
            arr[i][minc] = arr1D[idx] ;
            idx++;
        }

        // bottom
        for (int j = minc + 1; j <= maxc; j++) {
            arr[maxr][j] = arr1D[idx];
            idx++;
        }

        // right
        for (int i = maxr - 1; i >= minr; i--) {
            arr[i][maxc] = arr1D[idx];
            idx++;
        }

        // top
        for (int j = maxc - 1; j >= minc + 1; j--) {
            arr[minr][j] = arr1D[idx];
            idx++;
        }

    }

    private static int[] get1DArrayFromShell(int[][] arr, int s) {
        int minr = s - 1;
        int minc = s - 1;
        int maxr = arr.length - s;
        int maxc = arr[0].length - s;

        int size = 2 * (maxr - minr + maxc - minc);
        int[] arr1D = new int[size];

        // left
        int idx = 0;
        for (int i = minr; i <= maxr; i++) {
            arr1D[idx] = arr[i][minc];
            idx++;
        }

        // bottom
        for (int j = minc + 1; j <= maxc; j++) {
            arr1D[idx] = arr[maxr][j];
            idx++;
        }

        // right
        for (int i = maxr - 1; i >= minr; i--) {
            arr1D[idx] = arr[i][maxc];
            idx++;
        }

        // top
        for (int j = maxc - 1; j >= minc + 1; j--) {
            arr1D[idx] = arr[minr][j];
            idx++;
        }

        return arr1D;
    }

    private static void rotate1DArray(int[] oneDArr, int r) {
        r = r % oneDArr.length;
        if (r < 0) {
            r += oneDArr.length;
        }
        reverse1DArray(oneDArr, 0, oneDArr.length - r - 1);
        reverse1DArray(oneDArr, oneDArr.length - r + 1, oneDArr.length - 1);
        reverse1DArray(oneDArr, 0, oneDArr.length - 1);
    }

    private static void reverse1DArray(int[] arr, int sidx, int ridx) {

        while (sidx <= ridx) {
            int temp = arr[sidx];
            arr[sidx] = arr[ridx];
            arr[ridx] = temp;

            sidx++;
            ridx--;
        }
    }

    private static void display(int[][] arr) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[0].length; j++) {
                System.out.print(arr[i][j] + " ,");
            }
            System.out.println();
        }
    }
}
