import java.util.*;

public class Solution {
    public int[] solution(int []arr) {
      
        Stack<Integer> st = new Stack<>();
        for (int a : arr){
            if (st.empty()){
                st.push(a);
            }
            else if (st.peek()!=a){
                st.push(a);
            }
        }
        
        int[] answer = new int[st.size()];
        for (int i = st.size()-1; i>=0; i--){
            answer[i] = st.pop();
        }
        
        return answer;
    }
}