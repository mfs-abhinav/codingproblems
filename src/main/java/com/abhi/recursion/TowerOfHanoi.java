package com.abhi.recursion;

import java.util.Scanner;

public class TowerOfHanoi {
    private static int NO_OF_MOVEMENT = 0;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number of disc");
        int discNum = sc.nextInt();
        System.out.println("Enter tower number 1");
        int t1id = sc.nextInt();
        System.out.println("Enter tower number 2");
        int t2id = sc.nextInt();
        System.out.println("Enter tower number 3");
        int t3id = sc.nextInt();

        printMovement(discNum, t1id, t2id, t3id);
        System.out.println("Total number of movement to shit discs: " + NO_OF_MOVEMENT);
    }

    private static void printMovement(int discNum, int t1id, int t2id, int t3id) {
        if (discNum == 0) {
            return;
        }
        printMovement(discNum-1, t1id, t3id, t2id);
        NO_OF_MOVEMENT++;
        System.out.println(discNum + "[" + t1id + " -> " + t2id + "]");
        printMovement(discNum-1, t3id, t2id, t1id);
    }
}
