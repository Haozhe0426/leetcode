package array01;

public class LC34 {
    public static void main(String[] args) {
        int[] nums = new int[]{};
        int target = 6;
        Solution02 solution02 = new Solution02();
        System.out.println(solution02.searchRange(nums, target)[0]);
        System.out.println(solution02.searchRange(nums, target)[1]);
    }

}

class Solution02 {
    public int[] searchRange(int[] nums, int target) {
        if (nums.length == 0 || target < nums[0] || target > nums[nums.length - 1]) {
            return new int[]{-1, -1};
        }
        int start = -1;
        int end = -1;
        int flag = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == target && flag == 0) {
                flag = 1;
                start = i;
            }
            if (nums[i] == target) {
                end = i;
            }
        }
        return new int[]{start, end};
    }

    public int[] searchRange02(int[] nums, int target) {
        if (nums.length == 0 || target < nums[0] || target > nums[nums.length - 1]) {
            return new int[]{-1, -1};
        }
        int leftBound = this.searchLeftBound(nums, target);
        int rightBound = this.searchRightBound(nums, target);
        if (leftBound < rightBound) {
            return new int[]{leftBound + 1, rightBound - 1};
        } else {
            return new int[]{-1, -1};
        }
    }

    private int searchLeftBound(int[] nums, int target) {
        int leftBound = -1;
        int left = 0;
        int right = nums.length - 1;
        while (left <= right) {
            int mid = (left + right) / 2;
            if (nums[mid] >= target) {
                right = mid - 1;
                leftBound = right;
            } else {
                left = mid + 1;
            }
        }
        return leftBound;
    }

    private int searchRightBound(int[] nums, int target) {
        int rightBound = -1;
        int left = 0;
        int right = nums.length - 1;
        while (left <= right) {
            int mid = (left + right) / 2;
            if (nums[mid] > target) {
                right = mid - 1;
            } else {
                left = mid + 1;
                rightBound = left;
            }
        }
        return rightBound;
    }
}
