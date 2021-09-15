package com.abhi.basics;

import java.util.Scanner;

public class PrintDigitsInNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int inputNumber = sc.nextInt();

        int numOfDigit = 0;
        int num = inputNumber;
        while (num != 0) {
            numOfDigit++;
            num = num / 10;
        }
        int div = (int) Math.pow(10, numOfDigit - 1);
        while (div != 0) {
            System.out.println(inputNumber / div);
            inputNumber = inputNumber % div;
            div = div / 10;
        }
    }
}
