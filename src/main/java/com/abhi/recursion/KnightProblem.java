package com.abhi.recursion;

import java.util.Scanner;

public class KnightProblem {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter board size");
        int n = sc.nextInt();
        int[][] chess = new int[n][n];
        System.out.println("Enter Knight row position");
        int r = sc.nextInt();
        System.out.println("Enter Knight col position");
        int c = sc.nextInt();

        printKnightSol(chess, r, c, 1);
    }

    private static void printKnightSol(int[][] chess, int row, int col, int move) {

        if (row < 0 || col < 0 || row >= chess.length || col >= chess.length || chess[row][col] > 0 ) {
            return;
        } else if (move == chess.length * chess.length) {
            move = chess.length * chess.length;
            dispalyBoard(chess);
            return;
        }

        chess[row][col] = move;
        printKnightSol(chess, row-2, col+1, move + 1);
        printKnightSol(chess, row-1, col+2, move + 1);
        printKnightSol(chess, row+1, col+2, move + 1);
        printKnightSol(chess, row+2, col+2, move + 1);
        printKnightSol(chess, row+2, col-1, move + 1);
        printKnightSol(chess, row+1, col-2, move + 1);
        printKnightSol(chess, row-2, col+1, move + 1);
        printKnightSol(chess, row-2, col-1, move + 1);
        chess[row][col] = 0;
    }

    private static void dispalyBoard(int[][] chess) {
        for (int i = 0; i < chess.length; i++) {
            for (int j = 0; j < chess[0].length; j++) {
                System.out.println(chess[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println();
    }
}
