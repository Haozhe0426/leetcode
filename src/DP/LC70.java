package DP;

public class LC70 {
    public static void main(String[] args){

    }
    private static int climbStairs(int n) {
        if(n < 3){
            return n;
        }
        int a = 1, b = 2, c = 3;
        for (int i = 3; i <= n; i++) {
            c = a + b;
            a = b;
            b = c;
        }
        return c;
    }
}
