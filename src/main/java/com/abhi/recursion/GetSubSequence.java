package com.abhi.recursion;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class GetSubSequence {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter input string");
        String str = sc.next();

        System.out.println("Sub sequence is: " + getSubSeq(str));
    }

    private static List<String> getSubSeq(String str) {
        if (str.length() == 0) {
            List<String> baseCase = new ArrayList<>();
            baseCase.add("");
            return baseCase;
        }

        char firstChar = str.charAt(0);
        List<String> subSeqList = getSubSeq(str.substring(1));

        List<String> mySeqList = new ArrayList<>();
        for (String sub: subSeqList) {
            mySeqList.add("" + sub);
        }

        for (String sub: subSeqList) {
            mySeqList.add(firstChar + sub);
        }
        return mySeqList;
    }
}
