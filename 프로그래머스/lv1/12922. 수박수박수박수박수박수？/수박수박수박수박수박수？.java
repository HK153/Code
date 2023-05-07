class Solution {
    public String solution(int n) {
        StringBuilder stringBuilder = new StringBuilder();
        for (int i =0; i<n/2;i++){
                stringBuilder.append("수박");
            }
        if  (n%2==1){
            stringBuilder.append("수");
        }
       
        String answer = stringBuilder.toString();
        return answer;
    }
}