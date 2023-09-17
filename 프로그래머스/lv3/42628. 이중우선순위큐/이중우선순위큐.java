import java.util.PriorityQueue;
import java.util.Collections;
class Solution {
    public int[] solution(String[] operations) {
        int[] answer = new int [2];
        PriorityQueue <Integer> pqMin = new PriorityQueue<>();
        PriorityQueue <Integer> pqMax = new PriorityQueue<>(Collections.reverseOrder());
        for(String o : operations){
            if(o.charAt(0) =='I'){
                pqMin.add(Integer.parseInt(o.substring(2)));
                pqMax.add(Integer.parseInt(o.substring(2)));
            }
            else if(!pqMin.isEmpty()){
                if(o.substring(2).equals("-1")){
                    int a = pqMin.poll();
                    pqMax.remove(a);
                }
                else{
                    int a = pqMax.poll();
                    pqMin.remove(a);
                }  
            }
           
        }
        
        if(!pqMin.isEmpty()){
            answer[0] = pqMax.peek();
            answer[1] = pqMin.peek();
            
        }
        return answer;
    }
}