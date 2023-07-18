package HashTable;

import java.util.HashMap;

public class LC242 {

}

class Solution242 {
    public boolean isAnagram(String s, String t) {
        HashMap<Character, Integer> hashMap = new HashMap<>();
        char[] chars = s.toCharArray();
        char[] chart = t.toCharArray();
        for (int i = 0; i < chars.length; i++) {
            hashMap.put(chars[i], hashMap.getOrDefault(chars[i], 0) + 1);
        }
        for (int i = 0; i < chart.length; i++) {
            if(hashMap.containsKey(chart[i])){
                hashMap.put(chart[i], hashMap.get(chart[i]) - 1);
                if(hashMap.get(chart[i]) == 0){
                    hashMap.remove(chart[i]);
                }
            }else{
                return false;
            }
        }
        if (hashMap.isEmpty()){
            return true;
        }else {
            return false;
        }
    }
}
