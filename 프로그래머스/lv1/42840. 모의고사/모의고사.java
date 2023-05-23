import java.util.ArrayList;
import java.util.List;

class Solution {
    public int[] solution(int[] answers) {
        int[] answer;
        int [] one = {1, 2, 3, 4, 5};
        int [] two = {2, 1, 2, 3, 2, 4, 2, 5};
        int [] three = {3, 3, 1, 1, 2, 2, 4, 4, 5, 5};
        List <Integer> oneAns = new ArrayList<>();
        List <Integer> twoAns = new ArrayList<>();
        List <Integer> threeAns = new ArrayList<>();

        int [] count = {0, 0, 0};
        
        for (int i = 0; i < answers.length; i++) {
            oneAns.add(one[i % one.length]);
            twoAns.add(two[i % two.length]);
            threeAns.add(three[i % three.length]);
        }
        
        for (int l =0; l<answers.length; l++){
            if (answers[l] == oneAns.get(l)){
                count[0]++;
            }
            if (answers[l] == twoAns.get(l)){
                count[1]++;
            }
            if (answers[l] == threeAns.get(l)){
                count[2]++;
            }
        }
        
        int maxCount = Math.max(count[0], Math.max(count[1], count[2]));
        List<Integer> resultList = new ArrayList<>();

        if (count[0] == maxCount) {
            resultList.add(1);
        }
        if (count[1] == maxCount) {
            resultList.add(2);
        }
        if (count[2] == maxCount) {
            resultList.add(3);
        }

        answer = new int[resultList.size()];
        for (int i = 0; i < resultList.size(); i++) {
            answer[i] = resultList.get(i);
        }
            
        return answer;
    }
}