class Solution {
    public int solution(String s) {
        int answer = 0;
        String ans = "";
        for (int i = 0; i < s.length(); i++) {
            Character a = s.charAt(i);
            if (Character.isDigit(a)) {
                ans += a;
            } else {
                if (a == 'z') {
                    ans += '0';
                    i = i + 3;
                } else if (a == 'o') {
                    ans += '1';
                    i = i + 2;
                } else if (a == 't') {
                    if (s.charAt(i + 1) == 'w') {
                        ans += '2';
                        i = i + 2;
                    } else if (s.charAt(i + 1) == 'h') {
                        ans += '3';
                        i = i + 4;
                    }
                } else if (a == 'f') {
                    if (s.charAt(i + 1) == 'o') {
                        ans += '4';
                        i = i + 3;
                    } else if (s.charAt(i + 1) == 'i') {
                        ans += '5';
                        i = i + 3;
                    }
                } else if (a == 's') {
                    if (s.charAt(i + 1) == 'i') {
                        ans += '6';
                        i = i + 2;
                    } else if (s.charAt(i + 1) == 'e') {
                        ans += '7';
                        i = i + 4;
                    }
                } else if (a == 'e') {
                    ans += '8';
                    i = i + 4;
                } else if (a == 'n') {
                    ans += '9';
                    i = i + 3;
                }
            }
        }
        answer = Integer.parseInt(ans);
        return answer;
    }
}