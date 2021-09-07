package com.abhi.recursion;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class GetKeypadCombination {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter key pressed");
        String num = sc.next();

        List<String> keypad = Arrays.asList("?!", "abc", "def", "ghi", "jkl", "mnop", "qrst", "uv", "xyz", ".;");
        List<String> agks = gks(keypad,num);
        System.out.println("All keypad combination: " + agks);
        System.out.println("All keypad combination size: " + agks.size());
    }

    private static List<String> gks(List<String> keypad, String num) {
        if (num.length() == 0) {
            List<String> base = new ArrayList<>();
            base.add("");
            return base;
        }

        int index = Character.getNumericValue(num.charAt(0));
        char[] options = (keypad.get(index)).toCharArray();
        List<String> gaks = gks(keypad, num.substring(1));
        List<String> mgaks = new ArrayList<>();

        for(String gak: gaks) {
            for (char ch : options) {
                mgaks.add(ch+gak);
            }
        }
        return mgaks;

    }
}
