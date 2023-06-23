import java.util.Arrays;

class Solution {
    public int[] solution(int k, int[] score) {
        int[] answer = new int[score.length];
        int[] ranking = new int[k];

        
        
        for (int i =0; i<score.length; i++){
            if (i<k){
                ranking[i] = score[i];
                Arrays.sort(ranking, 0,i+1);
                answer[i] = ranking[0];
            }
            else{
                
                if (ranking[0]< score[i]){
                    ranking[0] = score[i];
                }
                Arrays.sort(ranking);
                answer[i] = ranking[0];
            }
                
        }
        return answer;
    }
}