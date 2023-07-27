package Sstring;

public class LC541 {
    public static void main(String args[]) {
        String s = "abcdefghijk";
        Solution541 solution541 = new Solution541();
        String t = solution541.reverseStr(s, 2);
        System.out.println(t);
    }
}

class Solution541 {
    public String reverseStr(String s, int k) {
        char[] chars = s.toCharArray();
        int left = 0;
        int i = 2 * k;
        while (i < s.length()) {
            reverse(chars, left, left + k - 1);
            left = i;
            i += 2 * k;
        }
        if (s.length() - left < k) {
            reverse(chars, left, s.length() - 1);
        } else {
            reverse(chars, left, left + k - 1);
        }
        return new String(chars);
    }

    public void reverse(char[] chars, int start, int end) {
        int left = start;
        int right = end;
        while (left < right) {
            char temp = chars[right];
            chars[right] = chars[left];
            chars[left] = temp;
            left++;
            right--;
        }
    }


}
