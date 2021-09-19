package com.abhi.array;

public class BinarySearch {
    public static void main(String[] args) {
        int[] arr = {10, 20, 30, 40, 50, 60, 70, 80, 90};
        int num = 71;
        int l = 0;
        int h = arr.length - 1;

        while (l <= h) {
            int m = (l + h) / 2;
            if(arr[m] > num) {
                h = m - 1;
            } else if (arr[m] < num) {
                l = m + 1;
            } else {
                System.out.println(m);
                break;
            }
        }
        System.out.println(-1);
    }
}
