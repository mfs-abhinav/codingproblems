package com.abhi.array;

import java.util.Scanner;

public class ReverseArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
        int l = arr.length - 1;
        for (int i = 0; i <= l / 2; i++) {
            int temp = arr[i];
            arr[i] = arr[l - i];
            arr[l - i] = temp;
        }

        System.out.println("Reverse of array is: ");
        for (int val: arr) {
            System.out.print(val);
        }
    }
}
