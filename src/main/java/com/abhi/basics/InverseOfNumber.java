package com.abhi.basics;

import java.util.Arrays;
import java.util.Scanner;

public class InverseOfNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int input = sc.nextInt();

        print1InverseOfNumber(input);
        print2InverseOfNumber(input);
    }

    private static void print2InverseOfNumber(int input) {
        int count = 1;
        int inverseNumb = 0;
        while ( input != 0 ) {
            int rem = input % 10;
            inverseNumb = inverseNumb + (int) Math.pow(10, rem - 1) * count;
            count++;
            input = input / 10;
        }
        System.out.println();
        System.out.print(inverseNumb);
    }

    private static void print1InverseOfNumber(int input) {
        int num = input;
        int count = 0;
        while (num !=0) {
            count++;
            num = num / 10;
        }
        int[] arr = new int[count];
        int i = count;
        int div = (int) Math.pow(10, count - 1);
        while (div !=0) {
            arr[(input / div) - 1] = i;
            input = input % div;
            div = div / 10;
            i--;
        }
        for (int j = arr.length-1; j >= 0; j--) {
            System.out.print(arr[j]);
        }
    }
}
