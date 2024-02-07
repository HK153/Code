class Solution {
    public String solution(String s) {
        StringBuilder sb = new StringBuilder();
        char[] letters = s.toCharArray(); // 문자열을 한 번에 char 배열로 변환

        // 단어별로 인덱스를 판별하기 위한 변수
        int index = 0; 

        for (char letter : letters) {
            // 공백을 만날 때마다 단어의 인덱스를 초기화
            if (letter == ' ') {
                index = 0;
            } else {
                // 짝수 인덱스면 대문자로, 홀수 인덱스면 소문자로 변환
                letter = (index % 2 == 0) ? Character.toUpperCase(letter) : Character.toLowerCase(letter);
                index++;
            }
            sb.append(letter);
        }

        return sb.toString();
    }
}