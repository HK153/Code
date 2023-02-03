class Solution {
    public int solution(String s) {
        int answer = 0;
        String [] s_string = s.split("");
        StringBuilder st =new StringBuilder();
        
        for (int i =0; i<s_string.length; i++){
            st.append(s_string[i]);
        }
        String num = st.toString();
        answer = Integer.parseInt(num);
        
        return answer;
    }
}