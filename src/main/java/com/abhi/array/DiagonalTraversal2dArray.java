package com.abhi.array;

import java.util.Scanner;

public class DiagonalTraversal2dArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[][] arr = new int[n][n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                arr[i][j] = sc.nextInt();
            }
        }
        System.out.println("Using approach 1:-");
        print1(arr);
        System.out.println("Using approach 2:-");
        print2(arr);
    }

    private static void print2(int[][] arr) {
        int minr = 0;
        int minc = 0;
        int maxr = arr.length - 1;
        int maxc = arr.length - 1;

        while (minc <= maxc) {
            for (int i = minr; i <= maxr; i++) {
                System.out.println(arr[i][i+minc]);
            }
            minc++;
            maxr--;
        }
    }

    private static void print1(int[][] arr) {
        // diagonal traversal
        for(int g = 0; g < arr.length; g++){
            for(int i = 0, j = i + g; j < arr.length; i++, j++){
                System.out.println(arr[i][j]);
            }
        }
    }
}
