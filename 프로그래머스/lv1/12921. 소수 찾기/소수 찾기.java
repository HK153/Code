class Solution {
    public int solution(int n) {
        int answer = 1;
        boolean flag = true;
        for (int i = 3; i<=n; i++){

            for (int j = 2; j<Math.sqrt(i)+1; j++){
               if (i%j == 0){
                   flag = false;
                   
                   break;
               }            
            }
            if(flag) {
                answer++;

                }
            flag = true;
        }
        return answer;
    }
}