package HashTable;

import java.util.HashMap;

public class LC383 {
}

class Solution {
    public boolean canConstruct(String ransomNote, String magazine) {
        char[] ransomNote2 = ransomNote.toCharArray();
        char[] magazine2 = magazine.toCharArray();
        HashMap<Character, Integer> note = new HashMap<>();
        for (char i : ransomNote2) {
            note.put(i, note.getOrDefault(i,0) + 1);
        }
        for (char j : magazine2){
            if (note.containsKey(j)){
                note.put(j, note.get(j) - 1);
                if (note.get(j) == 0){
                    note.remove(j);
                }
            }
        }
        if(note.isEmpty()){
            return true;
        }else {
            return false;
        }
    }
}