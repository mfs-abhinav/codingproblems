package com.abhi.map;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class GetCommonElements1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n1 = sc.nextInt();
        int[] arr1= new int[n1];
        for (int i = 0; i < n1; i++) {
            arr1[i] = sc.nextInt();
        }
        int n2 = sc.nextInt();
        int[] arr2= new int[n2];
        for (int i = 0; i < n2; i++) {
            arr2[i] = sc.nextInt();
        }

        Map<Integer, Integer> map = new HashMap<>();
        for (int k : arr1) {
            if (map.containsKey(k)) {
                map.put(k, map.get(k) + 1);
            } else {
                map.put(k, 1);
            }
        }

        for (int i : arr2) {
            if (map.containsKey(i)) {
                System.out.println(i);
                map.remove(i);
            }
        }
    }
}
