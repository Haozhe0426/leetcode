package array01;

public class LC69 {
    public static void main(String[] args) {
        System.out.println(new Solution03().mySqrt(1));
    }
}

class Solution03 {
    public int mySqrt(int x) {
        if (x == 0 || x == 1) {
            return x;
        }
        int left = 0;
        int right = x / 2;
        while (left <= right) {
            int mid = left + (right - left) / 2;
            long temp = (long) mid * mid;
            if (temp == x) {
                return mid;
            } else if (temp > x) {
                right = mid - 1;
            } else {
                left = mid + 1;
            }
        }
        return right;
    }
}
