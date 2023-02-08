class Solution {
    public String solution(String phone_number) {
        int a = phone_number.length();
        String s = "*";
        String sub = phone_number.substring(a-4,a);
        String answer = s.repeat(a-4) + sub;
        return answer;
    }
}