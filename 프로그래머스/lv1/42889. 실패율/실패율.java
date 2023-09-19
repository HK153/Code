import java.util.*;

class Solution {
    public int[] solution(int N, int[] stages) {
        int[] answer = new int[N];
        Map<Integer, Double> map = new HashMap<>();
        Arrays.sort(stages);
        for(int i = 1; i<=N; i++){
            double f = 0;
            double pass = 0;
            double fail = 0;
            boolean check = true;
            for (int j = 0; j<stages.length; j++){
                if (stages[j] == i){
                    fail++;
                    if (check){
                        pass = stages.length - j;
                        check = false;
                    }
                }
            }
            if (pass ==0){
                pass = 1;
            }
            f = fail / pass;
            
            map.put(i , f);

        }
        List <Map.Entry<Integer, Double>> list = new ArrayList<>(map.entrySet());
        list.sort(Collections.reverseOrder(Map.Entry.comparingByValue()));
        
        for (int i = 0; i<N; i++) {
            Map.Entry<Integer, Double> entry = list.get(i);
            answer[i] = entry.getKey();
         }
        
        return answer;
    }
}