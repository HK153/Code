class Solution {
    public int solution(int n) {
        int answer = 0;
       
        int count = Integer.bitCount(n); 

        while(true){
            n++;
            int countN = Integer.bitCount(n); 
            if (count == countN){
                answer = n;
                break;
            }
        }
        return answer;
        }
    }
