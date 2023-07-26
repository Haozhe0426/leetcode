package HashTable;

import java.util.HashMap;

public class LC1 {
}

class Solution01 {
    public int[] twoSum(int[] nums, int target) {
        int[] res = new int[2];
        HashMap<Integer,Integer> hashMap = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            int number = target-nums[i];
            if(hashMap.containsKey(number)){
                res[0] = i;
                res[1] = hashMap.get(number);
            }else {
                hashMap.put(nums[i], i);
            }
        }
        return res;
    }
}
