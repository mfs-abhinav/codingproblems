package com.abhi.pattern;

import java.util.Scanner;
/*
1
1	1
1	2	1
1	3	3	1
1	4	6	4	1
*/
// formula - nCk+1 = nCk * (n - k) / (k + 1)
public class Pattern13 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        for (int i = 0; i < n; i++) {
            int icj = 1;
            for (int j = 0; j <= i; j++) {
                System.out.print(icj + "\t");
                int icj1 = icj * (i - j) / (j + 1);
                icj = icj1;
            }
            System.out.println();
        }

    }
}
