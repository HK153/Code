import java.util.PriorityQueue;
import java.util.Collections;
class Solution {
    public long solution(int n, int[] works) {
        long answer = 0;
        int sum = 0; 
        PriorityQueue <Integer> max = new PriorityQueue <>(Collections.reverseOrder());
        for(int w: works){
            sum += w;
            max.offer(w);
        }
        if (sum-n <0){
            answer = 0;
        }
        else{
            for(int i = 0; i<n; i++){
                int work = max.poll() - 1;
                max.offer(work);
            }
            for(int m : max){
                answer += m*m;
            }
        }
        
        return answer;
    }
}