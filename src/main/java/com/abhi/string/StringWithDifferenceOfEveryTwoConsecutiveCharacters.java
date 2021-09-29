package com.abhi.string;

import java.util.Scanner;

/*
For "abecd", the answer should be "a1b3e-2c1d", as
   'b'-'a' = 1
   'e'-'b' = 3
   'c'-'e' = -2
   'd'-'c' = 1
*/

public class StringWithDifferenceOfEveryTwoConsecutiveCharacters {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();

        StringBuilder sb = new StringBuilder();
        sb.append(str.charAt(0));

        for (int i = 1; i < str.length(); i++) {
            char curr = str.charAt(i);
            char prev = str.charAt(i - 1);
            sb.append(curr - prev);
            sb.append(curr);
        }
        System.out.println(sb);
    }
}
