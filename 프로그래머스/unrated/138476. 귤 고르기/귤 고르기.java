import java.util.HashMap;
import java.util.Map;
import java.util.ArrayList;
import java.util.Collections;

class Solution {
    public int solution(int k, int[] tangerine) {
        int answer = 0;
        
        HashMap<Integer,Integer> hm = new HashMap<>();
        ArrayList<Integer> num = new ArrayList<>();
        
        for (int t : tangerine){
            if(!hm.containsKey(t)){
                hm.put(t,1);
            }
            else{
                hm.replace(t,hm.get(t)+1);
            }
        }
        
        for(Map.Entry<Integer,Integer> entry : hm.entrySet()){
            num.add(entry.getValue());
        }
        
        Collections.sort(num, Collections.reverseOrder());

        for(int i=0; i<num.size(); i++){
            if(k - num.get(i) > 0){
                k = k-num.get(i);
                answer++;
                continue;
            }
            else{
                answer++;
                break;
            }
        }
        
        return answer;
    }
}