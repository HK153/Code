import java.util.Queue;
import java.util.LinkedList;

class Solution {
    public int solution(int cacheSize, String[] cities) {
        int answer = 0;
        Queue <String> cache = new LinkedList<>();
        for (String city : cities){
            city = city.toLowerCase();
            
            if (cache.isEmpty() && cacheSize > 0){
                cache.offer(city);
                answer += 5;
            }
            else if (cache.contains(city)){
                cache.remove(city);
                cache.offer(city);
                answer++;
    
            }
            else{
                if(cache.size() < cacheSize){
                    cache.offer(city);
                }
                else if (cache.size() == cacheSize && cacheSize > 0) {
                    cache.poll();
                    cache.offer(city);
                }
                answer += 5;
            }
        }
        return answer;
    }
}