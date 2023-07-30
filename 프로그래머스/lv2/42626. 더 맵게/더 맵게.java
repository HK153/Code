import java.util.PriorityQueue;
class Solution {
    public int solution(int[] scoville, int K) {
        int answer = 0;
        PriorityQueue <Integer> pq = new PriorityQueue <>();
        for (int i =0; i<scoville.length; i++){
            pq.offer(scoville[i]);
        }
        
        while(pq.peek() < K && pq.size() >=2){
                int n = pq.poll() + pq.poll()*2;
                pq.offer(n);
                answer++;
        }
        if (pq.peek() < K && pq.size()<2){
            answer = -1;
        }
        
        return answer;
    }
}