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
        ans = 0;
        while(true){
            ans++;
            if (ans % n == 0 && ans % m == 0){
                answer[1] = ans;
                break;
            }
        }
        
        return answer;
    }
}