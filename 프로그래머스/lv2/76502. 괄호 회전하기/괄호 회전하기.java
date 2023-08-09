import java.util.LinkedList;
import java.util.Stack;
class Solution {
    public int solution(String s) {
        int answer = 0;
        LinkedList <Character> link = new LinkedList<>();
        Stack <Character> st = new Stack<>();
        for (int i = 0; i<s.length(); i++){
            link.add(s.charAt(i));
        }
        for (int j =0; j<s.length(); j++){
            for (Character data : link){
                if (st.isEmpty()){
                   st.push(data); 
                }
                else if (st.peek() == '(' && data == ')'){
                    st.pop();
                }
                else if (st.peek() == '{' && data == '}'){
                    st.pop();
                }
                else if (st.peek() == '[' && data == ']'){
                    st.pop();
                }
                else {
                    st.push(data);
                }
                
            }
            if (st.isEmpty()){
                answer++;
            }
            st.clear();
            Character a = link.getFirst();
            link.removeFirst();
            link.add(a);    
        }
        
        return answer;
    }
}