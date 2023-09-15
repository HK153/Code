import java.util.Queue;
import java.util.LinkedList;

class Solution {
    public int solution(int n, int[][] computers) {
        int answer = 0;
        
        boolean[] visited = new boolean[n];
        Queue <Integer> que = new LinkedList<>();
        
        int cnt = 0;
        
        for (int i =0; i<n; i++){
            if (visited[i]){
                continue;
            }
            else{
                que.offer(i);
                answer++;
                
                while(!que.isEmpty()){
                    int current = que.poll();
                    visited[current] = true;
                     for (int j =0; j<n; j++){
                        if (visited[j]){
                            continue;
                        }
                        else{
                            if(computers[current][j] == 1 && current != j){
                                que.offer(j);
                                visited[j] = true;
                            }
                            else{
                                continue;
                            }
                        }
                        
                    }
                }

            }
        }
        
        
        
        return answer;
    }
    
    
}