class Solution {
    public int solution(int num) {
        int answer = 0;
        while(true){
            if (num<=0){
                answer =-1;
                break;
            }
            if(num%2==0){
            num= num/2;
            answer++;
            }
            else if (num%2==1){
                if (num==1)break;
                num= num*3 +1;
                answer++;
             }
        }
        return answer;
    }
}