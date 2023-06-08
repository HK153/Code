import java.util.HashMap;
class Solution {
    public int[] solution(String s) {
        int[] answer = new int[s.length()];
        HashMap <Character, Integer> hm = new HashMap<>();
        for(int i=0; i<s.length(); i++){
            if(hm.containsKey(s.charAt(i))){
                answer[i] = i - hm.get(s.charAt(i));
            }
            else{
                answer[i]= -1;
            }
            hm.put(s.charAt(i), i);
        }
        return answer;
    }
}