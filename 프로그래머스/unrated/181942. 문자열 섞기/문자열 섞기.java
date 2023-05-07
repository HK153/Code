class Solution {
    public String solution(String str1, String str2) {
        String [] one_str1 = str1.split("");
        String [] one_str2 = str2.split("");
        StringBuilder stringBuilder = new StringBuilder();
        for (int i =0; i<str1.length(); i++){
            stringBuilder.append(one_str1[i]);
            stringBuilder.append(one_str2[i]);
        }
        String answer = stringBuilder.toString();
        return answer;
    }
}