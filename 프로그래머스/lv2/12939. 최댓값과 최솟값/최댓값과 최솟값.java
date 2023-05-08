class Solution {
    public String solution(String s) {
        
        String [] str = s.split(" ");
      
        String max = str[0];
        String min = str[0];
        
        for(String n : str){
            if (Integer.parseInt(n)>Integer.parseInt(max)){
                max=n;
            }
            if (Integer.parseInt(n)<Integer.parseInt(min)){
                min=n;
            }
        }

        String answer = min+" "+max;
        return answer;
    }
}