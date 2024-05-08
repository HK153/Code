import java.util.*;
class Solution {
    public long solution(long n) {
        long answer = 0;
        
        String ans = "";
        String num = Long.toString(n);
        String [] s = num.split("");
        
        Arrays.sort(s, Comparator.reverseOrder());
        for (String a : s){
            ans += a;
        }
        answer = Long.valueOf(ans);

        return answer;
    }
}