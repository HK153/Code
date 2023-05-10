import java.util.Stack;

class Solution {
    boolean solution(String s) {
         
        Stack<Character> st = new Stack<>();
        
        boolean answer = true;
        for (int i =0; i<s.length();i++){
            char c = s.charAt(i);
            
            if (c=='('){
                st.push(c);
            }
            else if (st.empty()){
                answer = false;
            }
            else {
                st.pop();
            }
        }
      
        if (!st.empty()){
            answer = false;
        }
        return answer;
    }
}