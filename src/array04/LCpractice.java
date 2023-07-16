package array04;

import java.util.ArrayList;
import java.util.List;

public class LCpractice {
    public static void main(String[] args) {
        int[][] matrix = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
        List<Integer> integers = new ArrayList<>();
        integers = new Solution01().spiralOrder(matrix);
        for (Object o : integers) {
            Integer op = (Integer) o;
            System.out.print(o + "\t");
        }
    }
}

class Solutionp {
    public List<Integer> spiralOrder(int[][] matrix) {
        List<Integer> integers = new ArrayList<>();
        int start = 0;
        int i, j;
        int m = matrix.length;
        int n = matrix[0].length;
        int length = m * n;
        int count = 0;
        int max = m / 2 > n / 2 ? m / 2 : n / 2;

        while (start < max) {
            for (j = start; j < n - start - 1; j++) {
                integers.add(matrix[start][j]);
                count++;
                if (count == length) {
                    return integers;
                }
            }
            for (i = start; i < m - start - 1; i++) {
                integers.add(matrix[i][j]);
                count++;
                if (count == length) {
                    return integers;
                }
            }
            for (; j > start; j--) {
                integers.add(matrix[i][j]);
                count++;
                if (count == length) {
                    return integers;
                }
            }
            for (; i > start; i--) {
                integers.add(matrix[i][start]);
                count++;
                if (count == length) {
                    return integers;
                }
            }
            start++;
        }
        if (m % 2 != 0 && n % 2 != 0) {
            integers.add(matrix[start][start]);
        }
        return integers;
    }
}


