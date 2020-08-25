package com.abhi.string;

import java.util.Arrays;

public class CheckStringAnagram {
    public static void main(String[] args) {
        String orginalStr = "abacbd";
        String randomString = "dcbaaa";
        Boolean isAnagram = checkAnagram(orginalStr, randomString);

        if (isAnagram) {
            System.out.println("String " + randomString + " is anagram of " + orginalStr);
        } else {
            System.out.println("String " + randomString + " is not anagram of " + orginalStr);
        }
    }

    public static boolean checkAnagram(String orginalStr, String randomString) {
        if (randomString.trim().length() == 0
                || orginalStr.trim().length() == 0
                || orginalStr.trim().length() != randomString.trim().length()) {
            throw new IllegalArgumentException();
        }
        char[] chars = orginalStr.toCharArray();
        Arrays.sort(chars);

        char[] chars1 = randomString.toCharArray();
        Arrays.sort(chars1);


        return Arrays.equals(chars, chars1);
    }
}
