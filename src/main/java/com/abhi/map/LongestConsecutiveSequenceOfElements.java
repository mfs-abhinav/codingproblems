package com.abhi.map;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class LongestConsecutiveSequenceOfElements {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        Map<Integer, Boolean> map = new HashMap<>();
        for (int k : arr) {
            map.put(k, true);
        }
        for (int k: arr) {
            if (map.containsKey(k - 1)) {
                map.put(k, false);
            }
        }
        int minLength = 0;
        int startPoint = 0;
        for (int k: arr) {
            if (map.get(k)) {
                int slen = 1;
                while (map.containsKey(k + slen)) {
                    slen++;
                }
                if (slen > minLength) {
                    minLength = slen;
                    startPoint = k;
                }
            }
        }
        for (int i = 0; i < minLength; i++) {
            System.out.println(startPoint + i);
        }
    }
}
