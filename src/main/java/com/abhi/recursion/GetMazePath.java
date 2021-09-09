package com.abhi.recursion;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class GetMazePath {
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

        System.out.println("Maze paths using 1st approach are: " + getMazePath1(sr, sc, dr, dc));
        System.out.println("Maze paths using 2nd approach are: " + getMazePath2(sr, sc, dr, dc));
    }

    private static List<String> getMazePath2(int sr, int sc, int dr, int dc) {
        if (sr == dr && sc == dc) {
            List<String> base = new ArrayList<>();
            base.add("");
            return base;
        }

        List<String> rPaths = new ArrayList<>();
        List<String> dPaths = new ArrayList<>();
        if (dc > sc) {
            rPaths = getMazePath2(sr, sc + 1, dr, dc);
        }

        if (dr > sr) {
            dPaths = getMazePath2(sr+1, sc, dr, dc);
        }

        List<String> myRes = new ArrayList<>();
        for(String rPath : rPaths) {
            myRes.add("r" + rPath);
        }
        for(String dPath : dPaths) {
            myRes.add("d" + dPath);
        }
        return myRes;
    }

    private static List<String> getMazePath1(int sr, int sc, int dr, int dc) {

        if (sc > dc || sr > dr) {
            return new ArrayList<>();
        }
        if (dr == sr && dc == sc) {
            List<String> baseCase = new ArrayList<>();
            baseCase.add(" ");
            return baseCase;
        }

        List<String> dcRowRes = getMazePath1(sr, sc, dr-1, dc);
        List<String> dcColRes = getMazePath1(sr, sc, dr, dc-1);

        List<String> myRes = new ArrayList<>();
        for(String dcRow: dcRowRes) {
            myRes.add("d" + dcRow);
        }
        for(String dcColRe: dcColRes) {
            myRes.add("r" + dcColRe);
        }
        return myRes;
    }
}
