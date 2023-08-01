public class LC {

}

class Solution {
    public boolean repeatedSubstringPattern(String s) {
        if(s == null){
            return false;
        }
        int[] next = new int[s.length()];
        getNext(next, s);
        if(next[s.length() - 1] != -1 && s.length() % (s.length() - next[s.length() - 1]) - 1 == 0 ){
            return true;
        }
        return false;

    }

    public void getNext(int[] next, String needle) {
        int j = -1;
        next[0] = j;
        for (int i = 1; i < needle.length(); i++){
            while (j >= 0 && needle.charAt(i) != needle.charAt(j + 1)){
                j = next[j];
            }
            if (needle.charAt(i) == needle.charAt(j + 1)){
                j++;
            }
            next[i] = j;
        }
    }
}
