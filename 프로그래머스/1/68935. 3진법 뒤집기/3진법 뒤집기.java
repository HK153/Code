import java.util.Stack;
class Solution {
    public int solution(int n) {
        int answer = 0;
        Stack <String> st = new Stack<>();
        String a = Integer.toString(n, 3);
        for(int i =0; i<a.length(); i++){
            st.push(a.charAt(i)+"");
        }
        String num = "";
        for(int j =0; j<a.length(); j++){
            num += st.pop();
        }

        return answer = Integer.parseInt(num,3);
    }
}