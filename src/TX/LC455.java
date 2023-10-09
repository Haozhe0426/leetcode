package TX;

import java.util.Arrays;

public class LC455 {
}

class Solution455 {
    public int findContentChildren(int[] g, int[] s) {
        Arrays.sort(g);
        Arrays.sort(s);
        int count = 0;
        int i = g.length - 1;
        int j = s.length - 1;
        while (i >= 0 && j >= 0){
            if(s[j] >= g[i]){
                j--;
                i--;
                count++;
            }else {
                i--;
            }
        }
        return count;
    }
}
