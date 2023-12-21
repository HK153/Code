class Solution {
    public int[] solution(long n) {
        String n_num = Long.toString(n);
        String [] n_string = n_num.split("");
        int[] answer = new int[n_num.length()];
        for(int i=0;i<n_num.length(); i++){
            answer[i]= Integer.parseInt(n_string[n_num.length()-1-i]);
        }
        return answer;
    }
}