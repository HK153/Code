class Solution {
    public int solution(int n) {
        long answer = 0;
        long [] fibo = new long [n+1];
        int m = 1234567;
        for (int i = 2; i<=n; i++){
            fibo[0] = 0;
            fibo[1] = 1;
            fibo[i] = (fibo[i-1] % m + fibo[i-2] % m) % m;
            answer = fibo[i] % m;
        }
        
        return (int) answer;
    }
}