package com.abhi.string;

import java.util.Arrays;

public class CheckStringAnagram {
    private static final int NO_OF_CHARS = 256;
    public static void main(String[] args) {
        String orginalStr = "abacbd";
        String randomString = "dcbaba";
//        Boolean isAnagram = checkAnagramApproach1(orginalStr, randomString);
//        Boolean isAnagram = checkAnagramApproach3(orginalStr, randomString);
        Boolean isAnagram = checkAnagramApproach3(orginalStr, randomString);

        if (isAnagram) {
            System.out.println("String " + randomString + " is anagram of " + orginalStr);
        } else {
            System.out.println("String " + randomString + " is not anagram of " + orginalStr);
        }
    }

    // complexity is O(n)
    private static Boolean checkAnagramApproach2(String orginalStr, String randomString) {

        int[] ostr = new int[NO_OF_CHARS];
        int[] rstr = new int[NO_OF_CHARS];

        char[] orginalStrArr = orginalStr.toCharArray();
        char[] randomStringArr = randomString.toCharArray();

        if (orginalStrArr.length != randomStringArr.length) {
            return false;
        }

        for (int i = 0; i < orginalStrArr.length; i++) {
            ostr[orginalStrArr[i]]++;
            rstr[randomStringArr[i]]++;
        }

        for (int i = 0; i < ostr.length; i++) {
            if (ostr[i] != rstr[i]) {
                return false;
            }
        }
        return true;
    }

    // we can optimze above approach with only 1 array
    private static boolean checkAnagramApproach3(String orStr, String raStr) {
        int[] orArr = new int[NO_OF_CHARS];
        char[] orStrArr = orStr.toCharArray();
        char[] raStrArr = raStr.toCharArray();

        if (orStrArr.length != raStrArr.length) {
            return false;
        }

        for (int i = 0; i < orStrArr.length; i++) {
            orArr[orStrArr[i]]++;
            orArr[raStrArr[i]]--;
        }

        for (int i = 0; i < orArr.length; i++) {
            if (orArr[i] != 0) {
                return false;
            }
        }
        return true;
    }

    // complexity is O(logn)
    public static boolean checkAnagramApproach1(String orginalStr, String randomString) {
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
