import java.util.PriorityQueue;
class Solution {
    public int solution(int[] scoville, int K) {
        int answer = 0;
        PriorityQueue <Integer> pq = new PriorityQueue <>();
        for (int i =0; i<scoville.length; i++){
            pq.offer(scoville[i]);
        }
        
        while(!pq.isEmpty()){
            if(pq.peek() >= K){
                break;
            }
            else if (pq.peek()< K){
                if (pq.size()<2){
                    answer = -1;
                    break;
                }
                int n = pq.poll() + pq.poll()*2;
                pq.offer(n);
                answer++;
            }
        }
        
        return answer;
    }
}