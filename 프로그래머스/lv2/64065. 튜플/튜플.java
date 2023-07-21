import java.util.HashMap;
import java.util.Map;

class Solution {
    public int[] solution(String s) {
        
        String num = s.replace("{","");
        num = num.replace("}","");
        String [] n = num.split(",");
        HashMap <Integer, Integer> hm = new HashMap<>();
        for(String a : n){
            int number = Integer.parseInt(a);
            if (!hm.containsKey(number)){
                hm.put(number, 1);
            }
            else {
                hm.put(number, hm.get(number)+1);
            }
        }
        HashMap <Integer, Integer> hmR = new HashMap<>();
        for (Map.Entry <Integer, Integer> e : hm.entrySet()){
            hmR.put(e.getValue(), e.getKey());
        }
        int[] answer = new int[hmR.size()];
        for (int i =0; i<hmR.size(); i++){
            answer[i] = hmR.get(hmR.size()-i);
        }
        return answer;
    }
}