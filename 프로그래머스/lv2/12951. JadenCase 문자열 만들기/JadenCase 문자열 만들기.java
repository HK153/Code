class Solution {
    public String solution(String s) {
        String answer = "";
        String [] word = s.toLowerCase().split("");
        boolean flag = true;
        
        for (String w : word){

            if(flag==true){
                answer += w.toUpperCase();
            }
            else{
                answer += w;
            }
            
            if (w.equals(" ")){
                flag = true;
            }
            else flag = false;
            
            }
        
        return answer;
    }
}