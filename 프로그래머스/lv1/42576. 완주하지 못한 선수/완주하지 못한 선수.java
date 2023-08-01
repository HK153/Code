import java.util.HashMap;
class Solution {
    public String solution(String[] participant, String[] completion) {

        HashMap<String, Integer> hmP = new HashMap<>();
        String answer = "";
        for(String p : participant){
            if(hmP.containsKey(p)){
                hmP.put(p, hmP.get(p)+1);
            }
            else{
                hmP.put(p, 1);
            }
        }
        
        for (String c : completion){
            if(hmP.containsKey(c) && hmP.get(c)==1){
               hmP.remove(c);
            }
            else{
                hmP.put(c, hmP.get(c)-1);
            }
        }
        
        for (String n : hmP.keySet()){
                answer = n;
            }
        
        return answer;
    }
}