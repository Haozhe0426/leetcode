package array02;

public class LC26 {
    public static void main(String[] args) {
        int [] nums = new int[]{1,1,2};
        System.out.println(new Solution01().removeDuplicates(nums));
        for (int i = 0; i < nums.length; i++) {
            System.out.print(nums[i]);
        }
    }
}

class Solution01 {
    public int removeDuplicates(int[] nums) {
        int slowIndex = 0;
        for (int fastIndex = 1; fastIndex < nums.length; fastIndex++) {
            if (nums[slowIndex] != nums[fastIndex]) {
                nums[++slowIndex] = nums[fastIndex];
                }
            }
        return ++slowIndex;
        }
}
