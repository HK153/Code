class Solution {
    boolean solution(String s) {
        int balance = 0; // 'p'와 'y'의 개수 차이를 나타내기 위한 변수
        s = s.toLowerCase(); // 모든 문자를 소문자로 변환

        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (c == 'p') {
                balance++; // 'p'가 나올 때마다 balance를 1 증가
            } else if (c == 'y') {
                balance--; // 'y'가 나올 때마다 balance를 1 감소
            }
        }

        // 'p'와 'y'의 개수가 동일하면 balance는 0일 것이므로, balance가 0이면 true, 아니면 false를 반환
        return balance == 0;
    }
}