package TX;

import java.util.Arrays;

public class LC1005 {

}

class Solution {
    public int largestSumAfterKNegations(int[] nums, int k) {
        Arrays.sort(nums);
        int i = 0;
        while (k > 0){
            if(nums[i] < 0){
                nums[i] = -nums[i];
                i = (i + 1) % nums.length;
                k--;
            }else {
                Arrays.sort(nums);
                if(k % 2 != 0){
                    nums[0] = -nums[0];
                }
                break;
            }
        }
        int sum = nums[0];
        for (int j = 1; j < nums.length; j++) {
            sum += nums[j];
        }
        return sum;
    }
}
