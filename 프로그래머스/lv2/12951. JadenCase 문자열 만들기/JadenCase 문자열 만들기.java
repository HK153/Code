class Solution {
    public String solution(String s) {
        String answer = "";
        String [] word = s.split(" ");
        
        for (int i =0; i<word.length; i++){
            System.out.println(word[i]);
            word[i] = word[i].toLowerCase();
            if(word[i].isEmpty()){
                answer += " ";
            }
            else{
                answer += " ";
                word[i] = Character.toUpperCase(word[i].charAt(0)) + word[i].substring(1);
                answer += word[i];
            }
            
        }
        answer = answer.substring(1);
        if (s.charAt(s.length()-1)==' '){
            answer += " ";
        }
        return answer;
    }
}