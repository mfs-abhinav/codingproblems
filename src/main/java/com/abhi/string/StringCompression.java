package com.abhi.string;

import java.util.Scanner;
/*
 First compression -> The string should be compressed such that consecutive duplicates of characters are replaced with a single character.
   For "aaabbccdee", the compressed string will be "abcde".
   Second compression -> The string should be compressed such that consecutive duplicates of characters are replaced with the character and followed by the number of consecutive duplicates.
   For "aaabbccdee", the compressed string will be "a3b2c2de2".
*/
public class StringCompression {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        print1Compression(str);
        print2Compression(str);
    }

    private static void print2Compression(String str) {
        char ch = str.charAt(0);
        int count = 1;
        String s = str.substring(0 , 1);
        for (int i = 1; i < str.length(); i++) {
            if (ch == str.charAt(i)) {
                count++;
            } else {
                if (count > 1) {
                    s += count;
                    count = 1;
                }
                ch = str.charAt(i);
                s += ch;
            }
        }
        if (count > 1) {
            s += count;
        }
        System.out.println("2nd compression: " + s);
    }

    private static void print1Compression(String str) {
        char ch = str.charAt(0);
        String s = str.substring(0 , 1);
        for (int i = 0; i < str.length(); i++) {
            if (ch != str.charAt(i)) {
                ch = str.charAt(i);
                s += ch;
            }
        }
        System.out.println("1st compression: " + s);
    }
}
