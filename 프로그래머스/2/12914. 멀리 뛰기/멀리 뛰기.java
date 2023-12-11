class Solution {
    public long solution(int n) {
        long answer = 0;
        long [] ans = new long[n];
        if (n==1){
                ans[0] =1;
            }
        else if (n==2) {
                ans[0] =1;
                ans[1] =2;
            }
        else {
            for (int i = 2; i<n; i++){
                ans[0] =1;
                ans[1] =2;
                ans[i] = (ans[i-2] + ans[i-1])%1234567;
            }
        }
        
        answer = ans[n-1];
        return answer;
    }
}