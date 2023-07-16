package array01;

public class LC35 {
    public static void main(String[] args) {
        int[] nums = {1, 3, 5, 6};
        int target = 0;
        Solution01 solution01 = new Solution01();
        System.out.println(solution01.searchInsert(nums, target));
    }
}

class Solution01 {
    public int searchInsert(int[] nums, int target) {
        if (target < nums[0]) {
            return 0;
        } else if (target > nums[nums.length - 1]) {
            return nums.length;
        }
        int left = 0;
        int right = nums.length - 1;
        while (left <= right) {
            int mid = (left + right) / 2;
            if (nums[mid] == target) {
                return mid;
            } else if (nums[mid] > target) {
                right = mid - 1;
            } else {
                left = mid + 1;
            }
        }
        return left;
    }
}
