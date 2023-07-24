import java.util.*;

public class Solution {
    public int solution(int n) {
        int ans = 1;
        int loc = n;
        
        while (true){
            if (loc == 1) break;
            else if (loc % 2 ==1){
                loc--;
                ans++;
            }
            loc /= 2;
        }

        return ans;
    }
}