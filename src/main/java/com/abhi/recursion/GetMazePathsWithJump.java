package com.abhi.recursion;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class GetMazePathsWithJump {
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

        System.out.println("Maze paths are: " + getMazePathWithJump(sr, sc, dr, dc));
    }

    private static List<String> getMazePathWithJump(int sr, int sc, int dr, int dc) {

        if (sr == dr && sc == dc) {
            List<String> base = new ArrayList<>();
            base.add("");
            return base;
        }

        List<String> myPaths = new ArrayList<>();

        for(int ms=1; ms<=dc-sc; ms++) {
            List<String> hPaths = getMazePathWithJump(sr, sc + ms, dr, dc);
            for(String hPath : hPaths) {
                myPaths.add("h" + ms + hPath);
            }
        }

        for(int ms=1; ms<=dr-sr; ms++) {
            List<String> hPaths = getMazePathWithJump(sr+ms, sc, dr, dc);
            for(String hPath : hPaths) {
                myPaths.add("v" + ms + hPath);
            }
        }

        for(int ms=1; ms<=dr-sr && ms<= dc-sc; ms++) {
            List<String> hPaths = getMazePathWithJump(sr+ms, sc+ms, dr, dc);
            for(String hPath : hPaths) {
                myPaths.add("d" + ms + hPath);
            }
        }
        return myPaths;
    }
}
