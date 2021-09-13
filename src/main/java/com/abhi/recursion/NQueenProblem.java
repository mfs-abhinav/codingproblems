package com.abhi.recursion;


import java.util.Scanner;

public class NQueenProblem {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter board size");
        int n = sc.nextInt();

        int[][] board = new int[n][n];

        printNQueenSol(board, "", 0);
    }

    private static void printNQueenSol(int[][] board, String path, int row) {
        if (row == board.length) {
            System.out.println(path);
            return;
        }

        for (int col = 0; col < board.length;  col++) {
            if (isItSafePlaceForQueen(board, row, col)) {
                board[row][col] = 1;
                printNQueenSol(board,path + row +"-" + col + ",", row + 1);
                board[row][col] = 0;
            }
        }
    }

    private static boolean isItSafePlaceForQueen(int[][] board, int row, int col) {
        for (int i = row -1, j = col; i >= 0; i--) {
            if (board[i][j] == 1) {
                return false;
            }
        }

        for (int i = row - 1, j = col - 1; i >= 0 && j >=0; i--, j--) {
            if (board[i][j] == 1) {
                return false;
            }
        }

        for (int i = row - 1, j = col + 1; i >= 0 && j < board.length; i--, j++) {
            if (board[i][j] == 1) {
                return false;
            }
        }

        return true;
    }
}
