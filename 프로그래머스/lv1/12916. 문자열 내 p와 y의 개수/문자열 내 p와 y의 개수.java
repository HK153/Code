class Solution {
    boolean solution(String s) {
        boolean answer = true;
        s = s.toLowerCase();
        int count_p =0;
        int count_y =0;
        String [] s_single = new String[s.length()];
        s_single = s.split("");
        for (int i=0; i<s.length();i++){
            
            if (s_single[i].equals("p")){
                count_p++;
            }
            else if (s_single[i].equals("y")){
                count_y++;
            }
        }
        
        if (count_p == count_y){
            answer=true;
        }
        else if(count_p != count_y){
            answer=false;
        }
        
        return answer;
    }
}