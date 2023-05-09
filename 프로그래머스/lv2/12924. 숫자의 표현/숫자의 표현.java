class Solution {
    public int solution(int n) {
        int answer = 1;
        int sum = 0;
        int count =0;
        
        if (n<=2){
            answer =0;
        }
        
        for (int i = 1; i<=(n/2)+1;i++){
            sum += i;
            count += 1;

            if (sum > n){
                sum = 0;
                i = i-count+1;
                count =0;
            }
            else if (sum == n){
                answer += 1;
                sum = 0;
                i = i-count+1;
                count =0;
            }
        }
        return answer;
    }
}