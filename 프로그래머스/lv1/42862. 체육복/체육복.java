import java.util.Arrays;
class Solution {
    public int solution(int n, int[] lost, int[] reserve) {
        int answer = n;
        Arrays.sort(lost);
        Arrays.sort(reserve);
        for (int i = 0; i<lost.length; i++){
            for (int k = 0; k<reserve.length; k++){
                if (lost[i] == reserve[k]){
                    lost[i] = -3;
                    reserve[k] = -1;
                }
            }
        }
        for (int i = 0; i<lost.length; i++){
            for(int j = 0; j<reserve.length; j++){
                if(lost[i] < 0) break;
                else if (lost[i] -1 == reserve[j] || lost[i] +1 == reserve[j]){
                    reserve[j] = -1;
                    break;
                }
                else if (reserve[j] == -1 && j != reserve.length-1){
                    continue;
                }
                else if (lost[i] > 0 && j == reserve.length-1){
                    answer--;
                }
            }
        }
        return answer;
    }
}