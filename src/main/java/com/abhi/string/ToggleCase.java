package com.abhi.string;

import java.util.Scanner;

public class ToggleCase {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();

        System.out.println("Toggle case using 1st approach:- ");
        toggleCase1(str);
        System.out.println("Toggle case using 2nd approach:- ");
        toggleCase2(str);
    }

    private static void toggleCase1(String str) {
        StringBuilder sb = new StringBuilder("");

        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if (ch >= 'a' && ch <= 'z') {
                ch = (char) (ch - 32);
                sb.append(ch);
            } else {
                ch = (char) (ch + 32);
                sb.append(ch);
            }
        }
        System.out.println(sb);
    }

    private static void toggleCase2(String str) {
        StringBuilder sb = new StringBuilder(str);

        for (int i = 0; i < sb.length(); i++) {
            char ch = sb.charAt(i);

            if (ch >= 'a' && ch <= 'z') {
                ch = (char) ('A' + ch - 'a');
            } else {
                ch = (char) ('a' + ch - 'A');
            }
            sb.setCharAt(i, ch);
        }
        System.out.print(sb);
    }
}
