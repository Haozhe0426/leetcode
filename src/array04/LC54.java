package array04;

import java.util.ArrayList;
import java.util.List;

public class LC54 {
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

class Solution01 {
    public List<Integer> spiralOrder(int[][] matrix) {
        int m = matrix.length;//行
        int n = matrix[0].length;//列
        int max = m / 2 > n / 2 ? m / 2 : n / 2;
        int length = m * n;
        int count = 0;
        int start = 0;
        int i = 0;
        int j = 0;
        List<Integer> integers = new ArrayList<>();

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
