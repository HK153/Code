import java.util.*;
class Solution {
    public int[] solution(int n, int s) {
        if (s< n){
            int [] answer = {-1};
            return answer;
        }
        int[] answer = new int[n];
        int temp = n;
        for(int i =0; i<n; i++){
            if(i == n-1){
                answer[i] = s;
            }
            else{
                answer[i] = s/temp;
                s -= s/temp;
                temp -= 1;
            }
        }
        
        return answer;
    }
}