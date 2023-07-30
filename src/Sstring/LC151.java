package Sstring;

public class LC151 {
    public static void main(String args[]) {
        Solution151 solution = new Solution151();
        System.out.println(solution.reverseWords("  i  love you  "));
    }
}

class Solution151 {
    public String reverseWords(String s) {
        StringBuilder stb = removeSpace(s);
        stb = reserve(stb, 0, stb.length() - 1);
        stb = reserveEachWords(stb);
        return stb.toString();
    }

    public StringBuilder removeSpace(String s) {
        StringBuilder stb = new StringBuilder();
        int start = 0;
        int end = s.length() - 1;
        while (s.charAt(start) == ' ') {
            start++;
        }
        while (s.charAt(end) == ' ') {
            end--;
        }
        char c = s.charAt(start);
        while (start <= end) {
            if (!(s.charAt(start) == ' ' && c == ' ')) {
                stb.append(s.charAt(start));
            }
            c = s.charAt(start);
            start++;
        }
        return stb;
    }

    public StringBuilder reserve(StringBuilder stb, int start, int end) {
        while (start < end) {
            char temp = stb.charAt(start);
            stb.setCharAt(start, stb.charAt(end));
            stb.setCharAt(end, temp);
            start++;
            end--;
        }
        return stb;
    }

    public StringBuilder reserveEachWords(StringBuilder stb){
        int start = 0;
        for (int i = 0; i < stb.length(); i++) {
            if (stb.charAt(i) == ' '){
                stb = reserve(stb, start ,i - 1);
                start = i + 1;
            }
        }
        return reserve(stb, start, stb.length() - 1);
    }


}
