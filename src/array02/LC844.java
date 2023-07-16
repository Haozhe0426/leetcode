package array02;

public class LC844 {
    public static void main(String[] args) {
        String s = "y#fo##f";
        String t = "y#f#o##f";
        System.out.println(new Solution03().backspaceCompare(s,t));
    }
}

class Solution03 {
    public boolean backspaceCompare(String s, String t) {
        char[] chars = s.toCharArray();
        char[] chart = t.toCharArray();

        int sl = deback(chars);
        String s1 = new String(chars, 0, sl);
        System.out.println(s1);
        int tl = deback(chart);
        String t1 = new String(chart, 0 ,tl);
        System.out.println(t1);
        if(s1.equals(t1)){
            return true;
        }else {
            return false;
        }
    }

    public int deback(char[] chars) {
        int slow = 0;
        for (int fast = 0; fast < chars.length; fast++) {
            if (chars[fast] != '#') {
                chars[slow++] = chars[fast];
            } else {
                if(slow != 0){
                    slow--;
                }
            }
        }
        return slow;
    }
}