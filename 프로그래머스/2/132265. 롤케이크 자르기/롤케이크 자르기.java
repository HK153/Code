import java.util.*;
class Solution {
    public int solution(int[] topping) {
        int answer = 0;
        int n = topping.length;
        HashMap <Integer, Integer> cake2 = new HashMap<>();
        
        for (int i = 0; i<n; i++){
            cake2.put(topping[i], cake2.getOrDefault(topping[i] , 0) +1);
        }
        
        HashSet <Integer> cake1 = new HashSet<>();
        
        int cakeSize1 = 0;
        int cakeSize2 = cake2.size();
        
        for (int i = 0; i<n-1; i++){
            
            int current = topping[i];
            int count = cake2.get(current);
            
            if(count == 1){
                cakeSize2--;
            }
            
            cake1.add(current);
            cake2.put(current, count -1);
            cakeSize1 = cake1.size();

            if(cakeSize1 == cakeSize2){
                answer++;
            }
        }
        
        return answer;
    }
}