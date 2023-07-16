package array03;

public class LC209 {
    public static void main(String[] args) {
        int[] nums = new int[]{1, 2, 3, 4, 5};
        int target = 11;
        System.out.println(new Solution().minSubArrayLen(target, nums));
    }
}

class Solution {
    public int minSubArrayLen(int target, int[] nums) {
        int begin = 0;
        int end = 0;
        int sum = 0;
        int result = 0;

        for (int i = 0; i < nums.length; i++) {
            sum += nums[i];
            end++;
            result = end;
            if (sum >= target) {
                while (sum - nums[begin] >= target) {
                    sum = sum - nums[begin++];
                }
                int length = end - begin;
                if (length < result) {
                    result = length;
                }
                break;
            }
        }

        if (sum < target) {
            return 0;
        }

        for (int i = end; i < nums.length; i++) {
            sum += nums[i];
            end++;
            while (sum - nums[begin] >= target) {
                sum = sum - nums[begin++];
            }
            int length = end - begin;
            if (length < result) {
                result = length;
            }
        }
        return result;
    }

    public int minSubArrayLen01(int target, int[] nums) {
        int sum = 0;
        int left = 0;
        int right = 0;
        int min = nums.length + 1;

        while (right < nums.length) {
            sum += nums[right++];
            while (sum >= target) {
                if (min > right - left) {
                    min = right - left;
                }
                sum = sum - nums[left++];
            }
        }
        if(min == nums.length + 1){
            return 0;
        }
        return min;
    }
}
