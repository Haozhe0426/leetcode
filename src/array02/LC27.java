package array02;

public class LC27 {
    public static void main(String[] args) {
        int[] nums = new int[]{0, 1, 2, 2, 3, 0, 4, 2};
        int val = 2;
        System.out.println(new Solution().removeElement01(nums, val));
        for (int i = 0; i < nums.length; i++) {
            System.out.print(nums[i]);
        }
    }
}

class Solution {
    public int removeElement(int[] nums, int val) {
        int length = nums.length;
        for (int i = 0; i < length; i++) {
            if (nums[i] == val) {
                for (int j = i; j < length - 1; j++) {
                    nums[j] = nums[j + 1];
                }
                length--;//记录长度减一
                i--;//整体往前移
            }
        }
        return length;
    }

    public int removeElement01(int[] nums, int val) {
        int slowIndex = 0;
        for (int fastIndex = 0; fastIndex < nums.length; fastIndex++) {
            if(nums[fastIndex] != val) {
                nums[slowIndex] = nums[fastIndex];
                slowIndex++;
            }
        }
        return slowIndex;
    }
}
