package array02;

public class LC977 {
    public static void main(String[] args) {
        int[] nums = new int[]{-4,-1,0,3,10};
        int[] num = new Solution04().sortedSquares(nums);
        for (int i = 0; i < num.length; i++) {
            System.out.println(num[i]);
        }
    }
}

class Solution04 {
    public int[] sortedSquares(int[] nums) {
        for (int i = 0; i < nums.length; i++) {
            nums[i] = (int) Math.pow(nums[i], 2);
        }
        int[] num = new int[nums.length];
        int slow = 0;
        int fast = nums.length - 1;
        for (int i = nums.length - 1; i >= 0; i--) {
            if (nums[slow] <= nums[fast]) {
                num[i] = nums[fast];
                fast--;
            }else {
                num[i] = nums[slow];
                slow++;
            }
        }
        return num;
    }
}
