package com.abhi.recursion;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class GetStairPaths {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter position on stair");
        int pos = sc.nextInt();
        System.out.println("Stair paths are: " + getStairPaths(pos));
    }

    private static List<String> getStairPaths(int pos) {

        if (pos < 0) {
            return new ArrayList<>();
        }
        if (pos == 0) {
            List<String> baseCase = new ArrayList<>();
            baseCase.add("");
            return baseCase;
        }

        List<String> firstRes = getStairPaths(pos-1);
        List<String> secRes = getStairPaths(pos-2);
        List<String> thirdRes = getStairPaths(pos-3);

        List<String> myRes = new ArrayList<>();
        for (String first : firstRes) {
            myRes.add("1" + first);
        }
        for (String sec : secRes) {
            myRes.add("2" + sec);
        }
        for (String third : thirdRes) {
            myRes.add("3" + third);
        }
        return myRes;
    }
}
