import java.util.*;

public class Solution {
    public int solution(int n) {
        int ans = 1;
        int loc = n;
        
        while (true){
            if (loc % 2 == 0){
                loc /= 2;
            }
            else if (loc == 1) break;
            else{
                loc--;
                ans++;
                loc /= 2;
            }
        }

        return ans;
    }
}