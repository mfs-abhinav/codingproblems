package com.abhi.map;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class GetCommonElements2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n1 = sc.nextInt();
        int[] arr1 = new int[n1];
        for(int i = 0; i < n1; i++) {
            arr1[i] = sc.nextInt();
        }
        int n2 = sc.nextInt();
        int[] arr2 = new int[n2];
        for(int i = 0; i < n2; i++) {
            arr2[i] = sc.nextInt();
        }

        printCommonElementsApproach1(arr1, arr2);
        printCommonElementsApproach2(arr1, arr2);

    }

    private static void printCommonElementsApproach2(int[] arr1, int[] arr2) {
        Map<Integer, Integer> map = new HashMap<>();
        for(int k: arr1) {
            if (map.containsKey(k)) {
                int val = map.get(k);
                map.put(k, val + 1);
            } else {
                map.put(k, 1);
            }
        }
        for (int k: arr2) {
            if(map.containsKey(k) && map.get(k) > 0) {
                System.out.println(k);
                map.put(k, map.get(k) - 1);
            }
        }
    }

    private static void printCommonElementsApproach1(int[] arr1, int[] arr2) {
        Map<Integer, Integer> map1 = new HashMap<>();
        for(int i : arr1) {
            if (map1.containsKey(i)) {
                map1.put(i, map1.get(i) + 1);
            } else {
                map1.put(i, 1);
            }
        }

        Map<Integer, Integer> map2 = new HashMap<>();
        for(int i : arr2) {
            if (map2.containsKey(i)) {
                map2.put(i, map2.get(i) + 1);
            } else {
                map2.put(i, 1);
            }
        }

        for (int k : map1.keySet()) {
            if (map2.containsKey(k)) {
                int count = Math.min(map1.get(k), map2.get(k));
                for (int i = 0; i < count; i++) {
                    System.out.println(k);
                }
            }
        }
    }
}
