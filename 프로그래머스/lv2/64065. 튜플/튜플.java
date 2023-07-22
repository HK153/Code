import java.util.Set;
import java.util.HashSet;
import java.util.Arrays;

class Solution {
    public int[] solution(String s) {
        
        String [] num = s.replace("{"," ").replace("}"," ").trim().split(" , ");
        Arrays.sort(num, (s1, s2) -> s1.length() - s2.length());

        Set <String> sl = new HashSet<>();
        int[] answer = new int[num.length];
        int idx = 0;
        
        for(String n : num){
            for(String n1 : n.split(",")){
                if (sl.add(n1)){
                    answer[idx++] = Integer.parseInt(n1);
                }
            }
        }

        return answer;
    }
}