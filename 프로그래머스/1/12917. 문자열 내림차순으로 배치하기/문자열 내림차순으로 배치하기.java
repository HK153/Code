import java.util.Arrays;
class Solution {
    public String solution(String s) {
        String answer = "";
        char[] ch = s.toCharArray();
 
        Arrays.sort(ch);
        for (int i = s.length()-1; i>=0; i--){
            answer += ch[i];
        }
        return answer;
    }
}