package array03;

import java.util.HashMap;
import java.util.Map;

public class LC904 {
    public static void main(String[] args) {
        int[] fruits = new int[]{3, 3, 3, 1, 2, 1, 1, 2, 3, 3, 4};
        System.out.println(new Solution01().totalFruit01(fruits));

    }
}

class Solution01 {
    public int totalFruit(int[] fruits) {
        int fruit1 = fruits[0];
        int max = 0;
        int fruit2 = -1;
        int begin = 0;
        int end = 0;
        int length = 0;
        for (int i = 1; i < fruits.length; i++) {
            if (fruits[i] != fruit1) {
                fruit2 = fruits[i];
                break;
            }
        }
        for (int i = 0; i < fruits.length; i++) {
            if (fruits[i] == fruit1 || fruits[i] == fruit2) {
                end++;
            } else {
                break;
            }
        }

        max = end;

        for (int i = end; i < fruits.length; i++) {
            if (fruits[i] != fruit1 && fruits[i] != fruit2) {
                fruit1 = fruits[i - 1];
                fruit2 = fruits[i];
            }
            for (int j = i - 1; j >= 0; j--) {
                if (fruits[j] == fruit1) {
                    begin = j;
                } else {
                    break;
                }
            }
            for (int j = i; j < fruits.length; j++) {
                if (fruits[j] == fruit2 || fruits[j] == fruit1) {
                    end = j;
                } else {
                    break;
                }
            }

            length = end - begin + 1;
            if (length > max) {
                max = length;
            }
        }
        return max;
    }

    public int totalFruit01(int[] fruits) {
        HashMap<Integer, Integer> fruitsMap = new HashMap<>();
        int right = 0;
        int left = 0;
        int max = 0;
        for (right = 0; right < fruits.length; right++) {
            fruitsMap.put(fruits[right], fruitsMap.getOrDefault(fruits[right], 0) + 1);
            while (fruitsMap.size() > 2) {
                fruitsMap.put(fruits[left], fruitsMap.get(fruits[left]) - 1);
                if (fruitsMap.get(fruits[left]) == 0) {
                    fruitsMap.remove(fruits[left]);
                }
                left++;
            }
            max = right - left + 1 > max ? right - left + 1 : max;
        }
        return max;
    }
}
