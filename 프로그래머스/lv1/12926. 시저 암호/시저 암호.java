class Solution {
    public String solution(String s, int n) {
        String answer = "";
        for (char c : s.toCharArray()){
            if (c == ' '){
                answer += ' ';
            }
            else if (c >= 'A' && c <= 'Z' && (int)c + n > 'Z'){
                answer += (char)(c + n - 26);    
            }
            else if (c >= 'a' && c<= 'z' && (int)c +n > 'z'){
                answer += (char)(c + n - 26); 
            }
            else {
                answer += (char)(c + n); 
            }

        }
        
        return answer;
    }
}