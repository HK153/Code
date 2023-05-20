class Solution {
    public String solution(String s, int n) {
        String answer = "";
               
        for (int i=0; i<s.length(); i++){
            char c = s.charAt(i);
            
            if (c == ' '){
                answer += ' ';
            }
            else if (c >= 'A' && c <= 'Z'){
                answer += (char)('A' + (c + n - 'A')%26);    
            }
            else if (c >= 'a' && c<= 'z'){
                answer += (char)('a' + (c + n - 'a')%26); 
            }


        }
        
        return answer;
    }
}