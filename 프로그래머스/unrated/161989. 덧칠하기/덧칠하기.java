import java.util.Stack;
class Solution {
    public int solution(int n, int m, int[] section) {
        int answer = 0;
        Stack <Integer> st = new Stack <>();
        for (int s : section){
            if (st.isEmpty() || st.peek() < s){
                st.push(s+m-1);
            }
            else {
                continue;
            }
        }
        answer = st.size();
        return answer;
    }
}