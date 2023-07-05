import java.util.LinkedList;
import java.util.Queue;

class Solution {
    public int solution(int[] priorities, int location) {
        int answer = 0;
        Queue<Integer> queue = new LinkedList<>();
        
        for (int priority : priorities) {
            queue.add(priority);
        }
        
        int target = location;
        
        while (!queue.isEmpty()) {
            int current = queue.poll();
            boolean isMaxPriority = true;
            
            for (int priority : queue) {
                if (priority > current) {
                    isMaxPriority = false;
                    break;
                }
            }
            
            if (isMaxPriority) {
                answer++;
                if (target == 0) {
                    break;
                }
            } else {
                queue.add(current);
            }
            
            target = (target - 1 + queue.size()) % queue.size();
        }
        
        return answer;
    }
}