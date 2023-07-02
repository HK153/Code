import java.util.Arrays;
import java.util.Collections;
class Solution {
    public String solution(String s) {
        String answer = "";
        Character [] ch = new Character[s.length()];
        for (int i =0; i<s.length(); i++){
            ch[i] = s.charAt(i);
        }
        Arrays.sort(ch, Collections.reverseOrder());
        for (Character a : ch){
            answer += a;
        }
        return answer;
    }
}