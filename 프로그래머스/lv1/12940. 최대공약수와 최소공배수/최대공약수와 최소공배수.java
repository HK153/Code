class Solution {
    public int[] solution(int n, int m) {
        int[] answer = new int[2];
        int ans = 0;
        while(true){
            ans++;
            if (n % ans == 0 && m % ans ==0){
                answer[0] = ans;
            }
            if (ans == n || ans == m){
                break;
            }
        }
        answer[1] = n * m / answer[0];
        
        return answer;
    }
}