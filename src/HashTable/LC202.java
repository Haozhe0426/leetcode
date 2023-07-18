package HashTable;

import java.util.HashSet;
import java.util.Set;

public class LC202 {
}

class Solution202 {
    public boolean isHappy(int n) {
        Set<Integer> set = new HashSet<>();
        int sum = this.getSum(n);
        while (!set.contains(sum)){
            if (sum == 1){
                return true;
            }
            set.add(sum);
            sum = this.getSum(sum);
        }
        return false;
    }

    public int getSum(int n){
        int sum = 0;
        while(n != 0){
            sum += (n%10) * (n%10);
            n = n/10;
        }
        return sum;
    }
}
