class Solution {
    public String solution(String s, int n) {
        String answer = "";
        for (int i = 0; i<s.length(); i++){

            if(97<=(int)s.charAt(i)&& (int)s.charAt(i)<=122 && (int)s.charAt(i) + n > 122){
                answer += (char)((int)s.charAt(i) + n - 26);    
            }
            else if (s.charAt(i) == ' '){
                answer += ' ';
            }
            else if ((int)s.charAt(i) >=65 && (int)s.charAt(i) <= 90 && (int)s.charAt(i) + n > 90){
                answer += (char)((int)s.charAt(i) + n - 26);    
            }
            else{
                answer += (char)((int)s.charAt(i) + n);
            }

        }
        
        return answer;
    }
}