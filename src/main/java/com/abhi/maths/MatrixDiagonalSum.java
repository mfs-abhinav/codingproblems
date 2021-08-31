package com.abhi.maths;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MatrixDiagonalSum {

    /*
     * Complete the 'diagonalDifference' function below.
     *
     * The function is expected to return an INTEGER.
     * The function accepts 2D_INTEGER_ARRAY arr as parameter.
     */

    public static int diagonalDifference(List<List<Integer>> arr) {
        int counter1 = 0;
        int counter2 = arr.size()-1;
        int primSum = 0;
        int secSum = 0;
        int sum = 0;

        for (int i = 0; i < arr.size(); i++) {
            List<Integer> inner = arr.get(i);
            for (int j = 0; j< inner.size(); j++) {
                if (counter1 == j) {
                    primSum = primSum + inner.get(j);
                    counter1++;
                    break;
                }
            }

            for (int j = 0; j< inner.size(); j++) {
                if (counter2 == j) {
                    secSum = secSum + inner.get(j);
                    counter2--;
                    break;
                }
            }
        }

        int matrixOrder = arr.size();
        for (int i = 0; i < matrixOrder; i++) {
            sum += arr.get(i).get(i);
            sum -= arr.get(i).get(matrixOrder -1-i);
        }

        //return Math.abs(primSum - secSum);
        return Math.abs(sum);

    }

}

class Solution {
    public static void main(String[] args) throws IOException {
//        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
//        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));
//
//        int n = Integer.parseInt(bufferedReader.readLine().trim());
//
//        List<List<Integer>> arr = new ArrayList<>();
//
//        IntStream.range(0, n).forEach(i -> {
//            try {
//                arr.add(
//                        Stream.of(bufferedReader.readLine().replaceAll("\\s+$", "").split(" "))
//                                .map(Integer::parseInt)
//                                .collect(toList())
//                );
//            } catch (IOException ex) {
//                throw new RuntimeException(ex);
//            }
//        });

        List<List<Integer>> arr = new ArrayList<>();
        arr.add(Arrays.asList(11, 2, 4));
        arr.add(Arrays.asList(4, 5, 6));
        arr.add(Arrays.asList(10, 8, -12));

        int result = MatrixDiagonalSum.diagonalDifference(arr);
        System.out.println("Diff is: " + result);

//        bufferedWriter.write(String.valueOf(result));
//        bufferedWriter.newLine();
//
//        bufferedReader.close();
//        bufferedWriter.close();
    }
}
