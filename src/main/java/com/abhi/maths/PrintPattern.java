package com.abhi.maths;
/*
Input
2
2
3
Output
2 2 1 1 $2 1 $
3 3 3 2 2 2 1 1 1 $3 3 2 2 1 1 $3 2 1 $
 */
import java.util.Scanner;
public class PrintPattern {
    public  static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t>0)
        {
            int n = sc.nextInt();
            GfG g = new GfG();
            g.printPat(n);
            System.out.println();
            t--;
        }
    }
}

class GfG {
    void printPat(int n) {
        for(int i = n; i >= 1; i--) {
            for(int j = n; j >= 1; j--) {
                for(int k = 1; k <= i; k++) {
                    System.out.print(j+" ");
                }
            }
            System.out.print("$");
        }
    }
}