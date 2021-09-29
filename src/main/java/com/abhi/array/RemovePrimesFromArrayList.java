package com.abhi.array;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class RemovePrimesFromArrayList {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();

        List<Integer> list = new ArrayList<>();
        for (int i = 0; i < size; i++) {
            list.add(sc.nextInt());
        }

        // concurrent modification
//        for (Integer i : list) {
//            if (isPrime(i)) {
//                list.remove(i);
//            }
//        }

        // 1st approach
        for (int i = list.size() - 1; i >= 0; i--) {
            if (isPrime(list.get(i))) {
                list.remove(i);
            }
        }
        System.out.println(list);
    }

    private static boolean isPrime(Integer i) {
        for (int j = 2; j * j <= i; j++ ) {
            if (i % j == 0) {
                return false;
            }
        }
        return true;
    }
}
