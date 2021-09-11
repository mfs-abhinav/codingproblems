package com.abhi.recursion;

import java.util.Arrays;
import java.util.Scanner;

public class FloodFill {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter row size of maze");
        int m = sc.nextInt();
        System.out.println("Enter column size of maze");
        int n = sc.nextInt();

        int[][] arr = new int[m][n];
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j< arr[0].length; j++) {
                System.out.println("Enter path exist or not: 1 means NO");
                arr[i][j] = sc.nextInt();
            }
        }
        System.out.println(Arrays.deepToString(arr));
        boolean[][] visited = new boolean[m][n];
        floodFill(arr, 0, 0, "", visited);
    }

    private static void floodFill(int[][] arr, int row, int col, String path, boolean[][] visited) {

        if (row < 0 || col < 0 || row == arr.length || col == arr[0].length || arr[row][col] == 1 || visited[row][col] == true) {
            return;
        }
        if (row == arr.length -1 && col == arr[0].length -1) {
            System.out.println(path);
            return;
        }

        visited[row][col] = true;
        floodFill(arr, row - 1, col, path + "t", visited);
        floodFill(arr, row , col - 1, path + "l", visited);
        floodFill(arr, row + 1, col, path + "d", visited);
        floodFill(arr, row, col + 1, path + "r", visited);
        visited[row][col] = false;
    }
}
