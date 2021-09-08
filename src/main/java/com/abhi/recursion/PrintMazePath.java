package com.abhi.recursion;

import java.util.Scanner;

public class PrintMazePath {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter source row position");
        int sr = scanner.nextInt();
        System.out.println("Enter source column position");
        int sc = scanner.nextInt();
        System.out.println("Enter destination row position");
        int dr = scanner.nextInt();
        System.out.println("Enter destination column position");
        int dc = scanner.nextInt();

        printMazePath1(sr, sc, dr, dc, "");
    }

    private static void printMazePath1(int sr, int sc, int dr, int dc, String path) {
        if(sr > dr || sc > dc) {
            return;
        }

        if (sr == dr && sc == dc) {
            System.out.println(path);
            return;
        }

        printMazePath1(sr+1,sc,dr,dc, path + "h");
        printMazePath1(sr,sc+1,dr,dc, path + "v");
    }

}
