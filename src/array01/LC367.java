package array01;

public class LC367 {
    public static void main(String[] args) {
        System.out.println(new Solution04().isPerfectSquare(9));
    }
}

class Solution04 {
    public boolean isPerfectSquare(int num) {
        int left = 0;
        int right = num;
        while (left <= right) {
            int mid = left + (right - left) / 2;
            long temp = (long) mid * mid;
            if (temp > num) {
                right = mid - 1;
            } else if (temp < num) {
                left = mid + 1;
            }else {
                return true;
            }
        }
    return false;
    }
}
