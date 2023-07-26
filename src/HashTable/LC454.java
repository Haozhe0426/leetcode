package HashTable;

import java.util.HashMap;

public class LC454 {
}

class Solution454 {
    public int fourSumCount(int[] nums1, int[] nums2, int[] nums3, int[] nums4) {
        HashMap<Integer, Integer> sumMap = new HashMap<>();
        for (int i : nums1) {
            for (int j : nums2){
                sumMap.put(i + j, sumMap.getOrDefault(i + j, 0) + 1);
            }
        }
        int count = 0;
        for (int i : nums3) {
            for (int j : nums4){
                if (sumMap.containsKey(-(i + j))){
                    count += sumMap.get(-(i + j));
                }
            }
        }
        return count;
    }
}
