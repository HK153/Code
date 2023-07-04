import java.util.Arrays;
class Solution {
    public int solution(int k, int m, int[] score) {
        int answer = 0;
        int count = 1;
        Arrays.sort(score);
        for(int i = score.length-1; i>=0; i--){
            if (i == score.length - m*count){
                answer += score[i]*m;
                count++;
            }
        }
        return answer;
    }
}