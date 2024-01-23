class Solution {
    public String solution(String s) {
        String[] words = s.split(" ", -1);
        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < words.length; i++) {
            char[] letters = words[i].toCharArray();

            for (int j = 0; j < letters.length; j++) {
                letters[j] = (j % 2 == 0) ? Character.toUpperCase(letters[j]) : Character.toLowerCase(letters[j]);
                sb.append(letters[j]);
            }

            if (words[i].isEmpty()) {
                sb.append(words[i]);
            }

            if (i < words.length - 1) {
                sb.append(" ");
            }
        }

        return sb.toString();
    }
}