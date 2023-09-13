class Solution {
    public int solution(String s) {
        int answer = 0;
        int aCnt = 0;
        int bCnt = 0;
        Character letter = '.';
        boolean check = false;
        
        for(int i = 0; i<s.length(); i++){
            if (check == false){
                letter = s.charAt(i);
                aCnt++;
                check = true;
                
            }
            else {
                if (s.charAt(i) == letter){
                    aCnt++;
                }
                else {
                    bCnt++;
                }
            }

            if(aCnt == bCnt){
                check = false;
                aCnt = 0;
                bCnt = 0;
                answer++;
            }
            else if(i == s.length()-1){
                answer++;
            }
     
        }
        return answer;
    }
}