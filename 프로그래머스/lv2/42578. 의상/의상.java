import java.util.HashMap;

class Solution {
    public int solution(String[][] clothes) {
        int answer = 1;
        HashMap <String, Integer> cloth = new HashMap<>();
        for (String [] cl : clothes){
            if(cloth.containsKey(cl[1])){
                cloth.put(cl[1], cloth.get(cl[1])+1);
            }
            else{
                cloth.put(cl[1], 1);
            }
        }
        
        for (int v : cloth.values()){
            answer *= v+1;
        }
        answer--;
        return answer;
    }
}