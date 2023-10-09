package TX;

import java.util.Arrays;

public class LC860 {
}

class Solution860 {
    public boolean lemonadeChange(int[] bills) {
        int f = 0, te = 0, tw = 0;
        for (int i = 0; i < bills.length; i++) {
            if (bills[i] == 5) {
                f++;
            } else if (bills[i] == 10) {
                if(f > 0){
                    f--;
                    te++;
                }else {
                    return false;
                }
            } else {
                if(te > 0 && f > 0){
                    te--;
                    f--;
                }else if(f >= 3){
                    f -= 3;
                }else {
                    return false;
                }
            }
        }
        return true;
    }
}
