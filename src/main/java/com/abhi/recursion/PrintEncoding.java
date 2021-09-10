package com.abhi.recursion;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class PrintEncoding {
    private static final Map<Integer, String> RULE = getRule();
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter digit");
        String num = sc.next();

        Map<Integer, String> rule = getRule();
        printEncoding(num, "");
    }

    private static void printEncoding(String num, String path) {
        if (num.length() == 0) {
            System.out.print(path + ", ");
            return;
        } else if (num.length() == 1) {
            char ch = num.charAt(0);
            if (ch == '0') {
                return;
            } else {
                int chv = ch - '0';
                char code = (char) ('a' + chv - 1);
                System.out.print(path + code + ", ");
            }
        } else {
            char ch1 = num.charAt(0);
            if (ch1 == '0') {
                return;
            } else {
                int ch1v = ch1 - '0';
                char code1 = (char) ('a' + ch1v - 1);
                printEncoding(num.substring(1), path + code1);
            }
            int ch12 = Integer.parseInt(num.substring(0,2));
            if (ch12 <= 26) {
                char code2 = (char) ('a' + ch12 - 1);
                printEncoding(num.substring(2), path + code2);
            }
        }
    }

    private static Map<Integer, String> getRule() {
        Map<Integer, String> rule = new HashMap<>();
        rule.put(1, "a");
        rule.put(2, "b");
        rule.put(3, "c");
        rule.put(4, "d");
        rule.put(5, "e");
        rule.put(6, "f");
        rule.put(7, "g");
        rule.put(8, "h");
        rule.put(9, "i");
        rule.put(10, "j");
        rule.put(11, "k");
        rule.put(12, "l");
        rule.put(13, "m");
        rule.put(14, "n");
        rule.put(15, "o");
        rule.put(16, "p");
        rule.put(17, "q");
        rule.put(18, "r");
        rule.put(19, "s");
        rule.put(20, "t");
        rule.put(21, "u");
        rule.put(22, "v");
        rule.put(23, "w");
        rule.put(24, "x");
        rule.put(25, "y");
        rule.put(26, "z");

        return rule;
    }
}
