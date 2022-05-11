package com.abhi.array;

/*Input: nums = [12,345,2,6,7896]
        Output: 2
        Explanation:
        12 contains 2 digits (even number of digits).
        345 contains 3 digits (odd number of digits).
        2 contains 1 digit (odd number of digits).
        6 contains 1 digit (odd number of digits).
        7896 contains 4 digits (even number of digits).
        Therefore only 12 and 7896 contain an even number of digits.
*/
public class FindNumbersWithEvenNoOfDigit {
    public static void main(String[] args) {
        System.out.println(findNumbersWithEvenNoOfDigit(new int[] {12,3456,2,6,7896}));
    }

    private static int findNumbersWithEvenNoOfDigit(int[] nums) {
        int evenNumberOfDigits = 0;

        for (int i: nums) {
            if (checkEvenNoOfDigit(i)) {
                evenNumberOfDigits++;
            }
        }

        return evenNumberOfDigits;
    }


    private static boolean checkEvenNoOfDigit(int num) {
        int noOfDigit = 0;
        while (num > 0) {
            noOfDigit++;
            num = num / 10;
        }

        return noOfDigit % 2 == 0;
    }
}
