package array04;

public class LC59 {
    public static void main(String[] args) {
        int n = 4;
        int[][] res = new int[3][3];
        res = new Solution().generateMatrix(n);
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(res[i][j]+"\t");
            }
            System.out.println();
        }
    }
}

class Solution {
    public int[][] generateMatrix(int n) {
        int[][] res = new int[n][n];
        int loop = 0;
        int start = 0;
        int count = 1;
        int i = 0;
        int j = 0;
        while (loop < n / 2) {
            for (j = start; j < n - loop-1; j++) {
                res[start][j] = count;
                count++;
            }
            for (i = start; i < n - loop-1; i++) {
                res[i][j] = count;
                count++;
            }
            for (; j > loop; j--) {
                res[i][j] = count;
                count++;
            }
            for (; i > loop; i--) {
                res[i][start] = count;
                count++;
            }
            start++;
            loop++;
        }
        if (n % 2 != 0) {
            res[start][start] = count;
        }
        return res;
    }
}
