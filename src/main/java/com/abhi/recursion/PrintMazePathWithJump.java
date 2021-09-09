package com.abhi.recursion;

import java.util.Scanner;

public class PrintMazePathWithJump {
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

        printMazePathWithJump(sr, sc, dr, dc, "");
    }

    private static void printMazePathWithJump(int sr, int sc, int dr, int dc, String path) {

        if (sr == dr && sc == dc) {
            System.out.println(path);
            return;
        }

        for(int ms=1; ms<=dc-sc; ms++) {
            printMazePathWithJump(sr, sc + ms, dr, dc, path + "h" + ms);
        }
        for(int ms=1; ms<=dr-sr; ms++) {
            printMazePathWithJump(sr + ms, sc, dr, dc, path + "v" + ms);
        }
        for(int ms=1; ms<=dr-sr && ms<=dc-sc; ms++) {
            printMazePathWithJump(sr + ms,sc + ms, dr, dc, path + "d" + ms);
        }

    }
}
