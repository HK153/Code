import java.util.*;

public class Solution {
    public int solution(int n) {
        int answer = 0;
        String [] numlsit = Integer.toString(n).split("");
        for (String num : numlsit ){
            int single = Integer.parseInt(num);
            answer += single;
        }
        return answer;
    }
}