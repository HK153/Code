class Solution {
    public boolean solution(int x) {
        int sum = 0;
        boolean answer = true; 
        
        String num = Integer.toString(x);
        String [] n = num.split("");
        for (String a : n){
            sum += Integer.parseInt(a);
        }
        if (x%sum != 0){
            answer = false; 
        }
      
        
        return answer;
    }
}