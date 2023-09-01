import java.util.Arrays;

class Solution {
    public int solution(int number, int limit, int power) {
        int answer = 0;
        
        int[] num = new int[number];
        for (int i =0; i<number; i++){
            int cnt = 0; 
            for (int j = 1; j*j <= (i+1); j++){
                if(j*j == i+1){
                    cnt++;
                }
                else if ((i+1) % j ==0){
                    cnt+=2;
                }
            }
            num[i] = cnt;
        }
        for (int n : num){
            if (n > limit){
                answer += power;
            }
            else{
                answer += n;
            }
        }
        return answer;
    }
}