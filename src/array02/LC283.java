package array02;

public class LC283 {
    public static void main(String[] args) {
        int [] nums = new int[]{0};
        new Solution02().moveZeroes(nums);
        for (int i = 0; i < nums.length; i++) {
            System.out.print(nums[i]);
        }

    }
}

class Solution02 {
    public void moveZeroes(int[] nums) {
        int slowIndex = 0;
        for (int fastIndex = 0; fastIndex < nums.length; fastIndex++) {
            if(nums[fastIndex] != 0){
                nums[slowIndex++] = nums[fastIndex];
            }
        }
        for (int i = slowIndex; i < nums.length; i++) {
            nums[i] = 0;
        }
    }
}
