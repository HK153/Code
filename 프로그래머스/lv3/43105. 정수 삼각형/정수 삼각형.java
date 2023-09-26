import java.util.*;
class Solution {

    public int solution(int[][] triangle) {
        int answer = 0;
        int idx = 0;
        int len = triangle.length;
        int [][] sum = new int [len][len];
        // 맨 마지막 요소 복사
        for(int i = 0; i<len; i++){
            sum[len-1][i] = triangle[len-1][i];
        }
        // 뒤 부터 더 큰 합 배열에 저장
        for(int i = len-2; i>=0; i--){
            for(int j = 0; j<=i; j++){
                sum[i][j] = Math.max(sum[i+1][j], sum[i+1][j+1]) + triangle[i][j];
            }
            
        }

        answer = sum[0][0];
        return answer;
    }
    
}