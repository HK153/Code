import java.util.*;
class Solution {
    public int solution(int[] people, int limit) {
        int answer = 0;
        int sum = 0;

        Arrays.sort(people);

        Deque <Integer> deque = new ArrayDeque<>();
        for (int p : people) {
            deque.add(p);
        }
        
        while (!deque.isEmpty()){
            sum = deque.pollLast();
            if (!deque.isEmpty() && sum + deque.peekFirst() <= limit){
                deque.pollFirst();
            }
            answer+=1;
        }
 
        return answer;
    }
}