import java.util.*;

class Solution {
    public int solution(String[] babbling) {
        
        int answer = 0;
        String [] words = {"aya", "ye","woo","ma"};
        
        for(String bab : babbling){
            
            for(int i = 0; i <words.length; i++){
                bab = bab.replace(words[i],Integer.toString(i+1));
            }
            
            char temp = '0';
            boolean check = true;
            
            for(int i = 0; i<bab.length(); i++){
                if(Character.isDigit(bab.charAt(i))){
                    if(bab.charAt(i) == temp){
                        check = false;
                        break;
                    }
                    else{
                        temp = bab.charAt(i);
                    }
                    
                }
                else{
                    check = false;
                    break;
                }
            }
            if(check){
                answer++;
            }
        }
        
        return answer;
    }
}