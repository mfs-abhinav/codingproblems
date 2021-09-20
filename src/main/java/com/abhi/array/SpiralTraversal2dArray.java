package com.abhi.array;

import java.util.Scanner;

public class SpiralTraversal2dArray {
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

        int minr = 0;
        int maxr = arr.length - 1;
        int minc = 0;
        int maxc = arr[0].length - 1;

        int noOfElements = n * m;
        int count = 0;

        while (count < noOfElements) {
            // left wall
            for (int i = minr; i <= maxr && count < noOfElements; i++) {
                System.out.println(arr[i][minc]);
                count++;
            }
            minc++;

            // bottom wall
            for (int j = minc; j <= maxc && count < noOfElements; j++) {
                System.out.println(arr[maxr][j]);
                count++;
            }
            maxr--;

            // right wall
            for (int i = maxr; i >= minr && count < noOfElements; i--) {
                System.out.println(arr[i][maxc]);
                count++;
            }
            maxc--;

            // top wall
            for (int j = maxc; j >= minc && count < noOfElements; j--) {
                System.out.println(arr[minr][j]);
                count++;
            }
            minr++;
        }
    }
}
